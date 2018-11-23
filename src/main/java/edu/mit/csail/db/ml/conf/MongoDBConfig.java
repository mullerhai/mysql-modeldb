package edu.mit.csail.db.ml.conf;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;


@Component
@Configuration
@EnableMongoRepositories
public class MongoDBConfig extends AbstractMongoConfiguration {

    protected  final Logger logger=LoggerFactory.getLogger(MongoDBConfig.class);


    @Value("${spring.data.mongodb.host}")
    private String mongoHost; // = "localhost";
    @Value("${spring.data.mongodb.port}")
    private int mongoPort ; //= 27017;

    @Value("${spring.data.mongodb.database}")
    private String dbName  ;//= "modeldb_metadata";

    private static final String MONGO_BASE_PACKAGE = "com.tz.config";
    @Autowired
    private ApplicationContext appContext;

    @Override
    protected String getDatabaseName() {
        return dbName;
    }

//    @Override
//    public Mongo mongo()  {
//        MongoClient mongoClient = new MongoClient(mongoHost, mongoPort);
//        return mongoClient;
//    }

    @Bean
    @Override
    public MongoClient mongoClient() {
        MongoClient mongoClient = new MongoClient(mongoHost, mongoPort);
        logger.info("Mongodb client session create succesfully : ");
        return mongoClient;
    }

    @Override
    protected String getMappingBasePackage() {
        return MONGO_BASE_PACKAGE;
    }

    @Override
    @Bean(name = "mongoTemplate")
    @Qualifier("mongoTemplate")
    public MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate= new MongoTemplate(mongoClient(), getDatabaseName());
        MongoDatabase db= mongoTemplate.getDb();
        logger.warn(db.toString());
        return  mongoTemplate;
    }


}
