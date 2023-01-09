package com.string;

import com.domain.Student;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生信息：");

        String stuInfo = sc.nextLine();

        String[] split = stuInfo.split("，");

        Student stu  = new Student(split[0],split[1]);

        System.out.println("学生姓名："+stu.getName());

        System.out.println("学生年龄："+stu.getAge());
    }
}
