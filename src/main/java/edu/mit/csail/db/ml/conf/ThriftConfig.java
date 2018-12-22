package edu.mit.csail.db.ml.conf;

import edu.mit.csail.db.ml.server.ModelDbServer;
import modeldb.ModelDBService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportFactory;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ThriftConfig {

    @Value("${spring.thrift.host")
    private String thrift_host;

    @Value("${spring.thrift.port}")
    private int  thrift_post;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private  String password;

    @Value("${spring.data.mongodb.host}")
    private  String  metadataDbHost;

    @Value("${spring.data.mongodb.port}")
    private int  metadataDbPort;

    @Value("${spring.data.mongodb.database}")
    private  String  metadataDbName;

//    @Value("${spring.metatype }")
//    private String  metadataDbType;
//   private edu.mit.csail.db.ml.server.storage.metadata.MetadataDb metadataDb;
//    @Value("${spring.dbtype}")
//    private  String dbType;

    @Autowired
    private DSLContext ctx;


    @Autowired
    private edu.mit.csail.db.ml.server.storage.metadata.MongoMetadataDb metadataDb;

    protected  final Logger logger=LoggerFactory.getLogger(ThriftConfig.class);
    public TThreadPoolServer  server;

    @Bean
    public TThreadPoolServer createThriftserver() throws Exception{
        TServerTransport transport = new TServerSocket(thrift_post);

        logger.info(" thrift config : username : "+userName+" pwd "+password+" metadbhost: "+metadataDbHost+" url "+url);
        // We use the binary protocol.

        metadataDb.open();
        TProtocolFactory protocolFactory = new TBinaryProtocol.Factory();
        TTransportFactory transportFactory = new TFramedTransport.Factory();
        TThreadPoolServer.Args serverArgs = new TThreadPoolServer.Args(transport)
                .processor(new ModelDBService.Processor<ModelDbServer>(new ModelDbServer(
//                        userName,
//                        password,
//                        url,
//                        ModelDbConfig.DatabaseType.MYSQL,
//                        metadataDbHost,
//                        metadataDbPort,
//                        metadataDbName,
//                        ModelDbConfig.MetadataDbType.MONGODB
                        this.ctx,
                        this.metadataDb
                )))
                .protocolFactory(protocolFactory)
                .transportFactory(transportFactory)
                .minWorkerThreads(1)
                .maxWorkerThreads(100);
        logger.info("begin");
        TThreadPoolServer server = new TThreadPoolServer(serverArgs);

        // Launch the server.
        logger.info("Starting the simple server on port %d...\n", thrift_post);
        server.serve();

        return server;
    }
}
