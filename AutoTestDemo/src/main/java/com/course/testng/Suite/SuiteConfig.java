package com.course.testng.Suite;

import org.testng.annotations.*;

/**
 * Created by 胡毅 on 2018/7/29.
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite 运行啦1");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite 运行啦1");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test 运行啦2");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test 运行啦2");
    }
    @BeforeGroups("login")
    public void beforeGroups(){
        System.out.println("这是在group--login之前运行的方法");
    }
    @AfterGroups("login")
    public void afterGroups(){
        System.out.println("这是在group--login之后运行的方法");
    }
    @BeforeGroups("pay")
    public void beforeGroup(){
        System.out.println("这是在group--pay之前运行的方法");
    }
    @AfterGroups("pay")
    public void afterGroup(){
        System.out.println("这是在group--pay之后运行的方法");
    }

}
