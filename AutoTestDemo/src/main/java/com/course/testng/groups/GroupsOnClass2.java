package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by 胡毅 on 2018/7/30.
 */

@Test(groups = "class2")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("Class2中的stu1运行");
    }

    public void stu2(){
        System.out.println("Class2中的stu2运行");
    }
}
