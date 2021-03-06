package com.atguigu.gulimall.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@MapperScan("com.atguigu.gulimall.oms.dao")
@SpringBootApplication
public class GullmallOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GullmallOmsApplication.class, args);
    }

}
