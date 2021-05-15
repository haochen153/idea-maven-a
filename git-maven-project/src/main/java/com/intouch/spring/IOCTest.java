package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;

public class IOCTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Date now=(Date)context.getBean("now");
        System.out.println("Now is "+ now );
        System.out.println("第一次修改");
        System.out.println("第二次修改");
        System.out.println("第3次修改分支");
        System.out.println("第三次修改");
        System.out.println("第四次修改");
    }
}
