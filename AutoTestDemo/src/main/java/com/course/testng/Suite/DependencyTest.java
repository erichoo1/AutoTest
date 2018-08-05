package com.course.testng.Suite;

import org.testng.annotations.Test;

/**
 * Created by 胡毅 on 2018/7/30.
 */
public class DependencyTest {

    @Test
    public void test1(){

        System.out.println("test1");
        throw new RuntimeException("运行时异常!");

    }

    @Test(dependsOnMethods = {"test1"})
    public void test2() {

        System.out.println("test2");

    }
}
