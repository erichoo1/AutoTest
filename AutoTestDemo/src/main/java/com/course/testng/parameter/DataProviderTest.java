package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by 胡毅 on 2018/8/5.
 */
public class DataProviderTest {
    @Test(dataProvider="data")
    public void dataProviderTest(String name,int age){
        System.out.println("name = "+name+";    age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] dataprovider(){

        return new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
    }

    @Test(dataProvider = "methoddata")
    public void test1(String name,int age){
        System.out.println("test1111 name="+name+"; age="+age);
    }

    @Test(dataProvider = "methoddata")
    public void test2(String name,int age){
        System.out.println("test2222 name="+name+"; age="+age);
    }

    @DataProvider(name = "methoddata")
    public Object[][] dptest(Method method){
        Object[][] o =null;

        if("test1".equals(method.getName())){
            o = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",30}
            };
        }else if("test2".equals(method.getName())){
            o = new Object[][]{
                    {"wangwu",40},
                    {"zhaoliu",50}
            };
        }

        return o;
    }
}
