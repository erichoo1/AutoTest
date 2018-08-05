package com.course.testng.timeout;

import org.testng.annotations.Test;

/**
 * Created by 胡毅 on 2018/8/5.
 */
public class TimeOutTest {

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
