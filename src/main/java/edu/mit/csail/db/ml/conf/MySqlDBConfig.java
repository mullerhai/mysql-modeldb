package edu.mit.csail.db.ml.conf;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
@Component
public class MySqlDBConfig {

    protected  static  final Logger logger=LoggerFactory.getLogger(MySqlDBConfig.class);

    private   DSLContext ctx;

//    @Autowired
    private HikariDataSource hikariDataSource;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private  String password;

//    @Autowired
//    private HikariConfig hikariConfig;
//
//    @Bean
//    public HikariDataSource getHikariDataSource( ){
//
//        this.hikariDataSource=new HikariDataSource(hikariConfig);
//        return this.hikariDataSource;
//    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig getConfig( ){
        HikariConfig config =new HikariConfig( );
        return  config;

    }


    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    public HikariDataSource dataSource() throws  Exception{
      //  this.hikariDataSource=(HikariDataSource) DataSourceBuilder.create().type(HikariDataSource.class).build();
        this.hikariDataSource=new HikariDataSource(getConfig());
        logger.info("hikari datasource pool  session create succesfully "+hikariDataSource.getConnection().toString());
        return this.hikariDataSource;
    }

    @Bean
    public DSLContext dslContext( ) throws  Exception{
       // this.hikariDataSource=(HikariDataSource) DataSourceBuilder.create().type(HikariDataSource.class).build();
       // logger.info("hikari datasource pool  session create succesfully ");
//        return this.hikariDataSource;
      //  Connection conn = DriverManager.getConnection(url, userName, password);
        Connection conn=this.hikariDataSource.getConnection();
        logger.info("use hikari datasource pool "+conn.toString());
        this.ctx=DSL.using(conn,SQLDialect.MYSQL);
        logger.info("jooq username: "+userName+ " pwd :"+password+ " url : "+url );
        logger.info(" jooq dsl  create successfully ");
        return this.ctx;
    }


//    @Bean(name = "primaryDataSource")
//    @Qualifier("primaryDataSource")
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.primary")
//    public DruidDataSource primaryDatasource() {
//        logger.info("database primary connection config is parsed by druid！！！");
//        return DruidDataSourceBuilder.create().build();
//    }

}
