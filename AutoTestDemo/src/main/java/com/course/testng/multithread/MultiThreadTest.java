package com.course.testng.multithread;

import org.testng.annotations.Test;

/**
 * Created by 胡毅 on 2018/8/5.
 */
public class MultiThreadTest {

    @Test(invocationCount = 10,threadPoolSize = 5)
    public void test1(){
        System.out.println("1");
        System.out.println(Thread.currentThread().getId());
    }
}
