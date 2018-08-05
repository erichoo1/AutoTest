package com.course.testng.Suite;

import org.testng.annotations.Test;

/**
 * Created by 胡毅 on 2018/7/30.
 */
public class ExceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionTest(){
        System.out.println("this is runTimeException Test!");
        throw new RuntimeException();
    }
}
