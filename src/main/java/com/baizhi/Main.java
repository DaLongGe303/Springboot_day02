package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.baizhi.dao")
public class Main {
    //springBoot入口函数
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
        System.out.println("====================");
    }
}



