package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by 胡毅 on 2018/7/30.
 */

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("teacher中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("teacher中的teacher2运行");
    }
}
