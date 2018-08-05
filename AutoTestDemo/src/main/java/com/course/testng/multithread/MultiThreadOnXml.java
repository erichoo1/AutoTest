package com.course.testng.multithread;

import org.testng.annotations.Test;

/**
 * Created by 胡毅 on 2018/8/5.
 */
public class MultiThreadOnXml {

    @Test
    public void test1(){

        System.out.println("test1");
        System.out.println("Thread ID is : "+Thread.currentThread().getId());
    }
    @Test
    public void test2(){

        System.out.println("test2");
        System.out.println("Thread ID is : "+Thread.currentThread().getId());
    }
    @Test
    public void test3(){

        System.out.println("test3");
        System.out.println("Thread ID is : "+Thread.currentThread().getId());
    }
}
