package com.string;

import com.domain.Student;

import java.util.Scanner;

public class String16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生信息：");

        String s= sc.nextLine();

        String[] split = s.split("，");

        //Student stu = new Student(split[0],split[1]);

        Student stu =new Student();

        stu.setName(split[0]);
        stu.setAge(split[1]);

        System.out.println("学生的姓名为："+stu.getName());

        System.out.println("学生的年龄为："+stu.getAge());
    }
}
