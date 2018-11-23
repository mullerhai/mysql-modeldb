package com.my.mymodeldb;

//import edu.mit.csail.db.ml.main.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.mit.*"})
public class MullerModeldbApplication {

    public static void main(String[] args)throws  Exception {

        SpringApplication.run(MullerModeldbApplication.class, args);
//        Main mainz=new Main();
//        mainz.main(args);
    }
}
