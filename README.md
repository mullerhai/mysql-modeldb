# mysql-modeldb

### mysql as database for MIT ml modeldb is coming




###       the office modeldb use sqlite as database ,but it can not use in product enviroment,so I have to tab and edit the office code let it can support  to mysql,so many days ,I have done it,thx for modeldb and jooq ,less time do it.

###       now the modeldb  server separate  can support mysql and sqlite both time that anyone you would use ,I add the springboot framework, you also can add some monitor and distribute mode like consul eurika and hystrix zuul,anything also


####      anyone want to use it ,can git clone 
####   https://github.com/mullerhai/mysql-modeldb/tree/master
if you like ,maybe mark  a star is better thx

2018-10-24
muller


CREATE DATABASE modeldb_test  CHARACTER SET utf8 COLLATE utf8_bin;

GRANT ALL PRIVILEGES ON modeldb_test.* TO 'muller'@'localhost' IDENTIFIED BY 'geotmt';

flush privileges;

use modeldb_test
source src/main/resources/mysql/createDB_new.sql


