package com;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by Song on 2017/2/15.
 * 官方示例工程中的测试代码
 */
@SpringBootApplication
@ComponentScan(basePackages = "com")
public class AppMain {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppMain.class, args);
    }
}