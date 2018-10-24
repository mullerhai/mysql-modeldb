# mysql-modeldb
mysql database for ml modeldb

CREATE DATABASE modeldb_test  CHARACTER SET utf8 COLLATE utf8_bin;

GRANT ALL PRIVILEGES ON modeldb_test.* TO 'muller'@'localhost' IDENTIFIED BY 'geotmt';

flush privileges;

use modeldb_test
source src/main/resources/mysql/createDB_new.sql


