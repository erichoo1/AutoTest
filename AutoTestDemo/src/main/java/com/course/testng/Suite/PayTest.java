package com.course.testng.Suite;

import org.testng.annotations.*;

/**
 * Created by 胡毅 on 2018/7/29.
 */
public class PayTest {

    @Test(groups = "pay")
    public void payDemo(){
        System.out.println("Pay Success!!!");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method 运行啦");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method 运行啦");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class 运行啦");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class 运行啦");
    }

}
