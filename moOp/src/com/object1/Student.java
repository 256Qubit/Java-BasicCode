package com.object1;

public class Student{
    //属性：姓名，年龄
    //成员变量：跟之前定义的格式一样，只不过位置发生了改变，类方法外

    String name;
    int age;

    //行为：学习
    //成员方法：跟之前定义方法的格式一样，只不过去除了static关键字
    public void sttudy(){
        System.out.println("学习");
    }
}
