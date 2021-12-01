package com.lingh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.lingh.dao")
@SpringBootApplication
public class LinghDynamicDatasourceTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinghDynamicDatasourceTestApplication.class, args);
    }

}
