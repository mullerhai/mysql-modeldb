package edu.mit.csail.db.ml.util;

import edu.mit.csail.db.ml.conf.ModelDbConfig;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import edu.mit.csail.db.ml.server.storage.metadata.MongoMetadataDb;
import edu.mit.csail.db.ml.server.storage.metadata.MetadataDb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class contains logic for connecting to the database.
 */
public class ContextFactory {

  static {
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * Create a database context that reflects a connection to a database.
   * @param username - The username to connect to the database.
   * @param password - The password to connect to the database.
   * @param jdbcUrl - The JDBC URL of the database.
   * @param dbType - The database type.
   * @return The database context.
   * @throws SQLException - Thrown if there are problems connecting to the database.
   * @throws IllegalArgumentException - Thrown if the dbType is unsupported.
   */
  protected  final static Logger logger=LoggerFactory.getLogger(ContextFactory.class);
  public static DSLContext create(
    String username, 
    String password, 
    String jdbcUrl, 
    ModelDbConfig.DatabaseType dbType
    ) throws SQLException, IllegalArgumentException {
    logger.info("Read the mysql connect string :"+jdbcUrl+" ****  "+username+" ***  "+password);
    Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

    switch (dbType) {
      case SQLITE: return DSL.using(conn, SQLDialect.SQLITE);
      case MYSQL:return  DSL.using(conn,SQLDialect.MYSQL);
    }

    throw new IllegalArgumentException(
      "Cannot connect to DatabaseType: " + dbType);
  }

  public static MetadataDb createMetadataDb(
    String host, 
    int port, 
    String name, 
    ModelDbConfig.MetadataDbType dbType) {
    switch (dbType) {
      case MONGODB: 
//        MetadataDb db = new MongoMetadataDb(host, port, name);
        MetadataDb db = new MongoMetadataDb();
        db.open();
        return db;
    }
    throw new IllegalArgumentException("Only MONGODB currently supported for " +
      "metadata");
  }
}
