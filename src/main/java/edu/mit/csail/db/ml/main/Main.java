package edu.mit.csail.db.ml.main;

import edu.mit.csail.db.ml.conf.ModelDbConfig;
import edu.mit.csail.db.ml.server.ModelDbServer;
import modeldb.ModelDBService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Main entry point of of the ModelDB Server.
 *
 * When you execute this file, you can include the following command line arguments:
 * (optional) --conf [path_to_conf_file]
 */
@Configuration
@Component
public class Main {

  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.username}")
  private String userName;

  @Value("${spring.datasource.password}")
  private  String password;


  protected  final static Logger logger=LoggerFactory.getLogger(Main.class);
  public  void main(String[] args) throws Exception {
    // Read the configuration. This uses the default configuration if no configuration is given in the
    // command line arguments.
    ModelDbConfig config = ModelDbConfig.parse(args);


    logger.info("username: "+userName+ " pwd :"+password+ " url : "+url );
    logger.info(config.dbUser+config.dbType+config.dbPassword+config.jbdcUrl);
    // Attempt to launch the server.
    try {
      TServerTransport transport = new TServerSocket(config.thriftPort);

      // We use the binary protocol.
      TProtocolFactory protocolFactory = new TBinaryProtocol.Factory();
      TTransportFactory transportFactory = new TFramedTransport.Factory();

      // Create a multi-threaded server. Process requests with an instance of
      // ModelDbServer.
//      config.dbUser,
//              config.dbPassword,
//              config.jbdcUrl,
//              config.dbType,
      TThreadPoolServer.Args serverArgs = new TThreadPoolServer.Args(transport)
        .processor(new ModelDBService.Processor<ModelDbServer>(new ModelDbServer(
                userName,
                password,
                url,
          config.dbType,
          config.metadataDbHost,
          config.metadataDbPort,
          config.metadataDbName,
          config.metadataDbType
        )))
        .protocolFactory(protocolFactory)
        .transportFactory(transportFactory)
        .minWorkerThreads(1)
        .maxWorkerThreads(100);
      logger.info("begin");
      TThreadPoolServer server = new TThreadPoolServer(serverArgs);

      // Launch the server.
      System.out.printf("Starting the simple server on port %d...\n", config.thriftPort);
      server.serve();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}