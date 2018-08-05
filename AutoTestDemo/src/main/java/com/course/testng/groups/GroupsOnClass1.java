package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by 胡毅 on 2018/7/30.
 */


@Test(groups = "class1")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("class1中的stu1运行");
    }

    public void stu2(){
        System.out.println("class1中的stu2运行");
    }
}
