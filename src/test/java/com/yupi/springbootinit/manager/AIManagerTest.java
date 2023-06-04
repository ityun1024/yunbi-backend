package com.yupi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AIManagerTest {

    @Resource
    AIManager aiManager;

    @Test
    void doChart() {
        String answer = aiManager.doChart(1661970273286574082L,"分析需求： \n" +
                "分析网站用户的增长情况 \n" +
                "原始数据： \n" +
                "日期,用户数 \n" +
                "1号,15 \n" +
                "2号,20 \n" +
                "3号,50 ");
        System.out.println(answer);
    }
}