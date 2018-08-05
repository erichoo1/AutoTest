package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by 胡毅 on 2018/7/29.
 */
public class BasicAnnotation {

    //最基本的注解,用来把方法标注为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("this is testcase 1");
    }

    @Test
    public void testcase2(){
        System.out.println("this is testcase 2");
    }

    //
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is Before Method ~~~~~~~这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this is After Method ~~~~~~~这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("this is Before Class ~~~~~~这是在类之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("this is After Class ~~~~~~这是在类之后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("this is Before Suite ~~~~~这是在套件之前运行的");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("this is After Suite ~~~~~这是在套件之后运行的");
    }
}
