package com.example.demo;

import com.example.demo.entity.Personnel;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Personnel personnel;

    @Autowired
    private ApplicationContext context;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        //日志级别 trace<debug<info<warn<error
        logger.trace("something trace");//记录application运行情况的信息以便追踪系统信息
        logger.debug("something debug");//记录application运行情况的信息以便调试
        logger.info("something info");//默认记录application运行情况的信息
        logger.warn("something warn");//记录application运行情况的信息用于警告
        logger.error("something error");//记录系统错误信息
    }


    @Test
    void printlnPersonnel() {
        System.out.println(personnel);
    }

    @Test
    void checkServiceExitOrNot() {
        boolean justPlayServiceExitOrNot = context.containsBean("justPlayService");
        System.out.println("justPlayService是否存在？" + justPlayServiceExitOrNot);
        boolean getJustPlayServiceExitOrNot = context.containsBean("getIJustPlayService");
        System.out.println("getIJustPlayService是否存在？" + getJustPlayServiceExitOrNot);
    }

    @Test
    void getSomethingElse() {
        Properties properties = new Properties();
        Class<Object> objectClass = Object.class;
        InputStream in = objectClass.getResourceAsStream("/somethingElse.properties");
        try {
            properties.load(in);
            System.out.println(properties.get("url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
