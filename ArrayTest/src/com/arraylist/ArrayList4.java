package com.arraylist;

import com.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {
    public static void main(String[] args) {
        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student stuInfo = list.get(i);

            System.out.println("学生的姓名为：" + stuInfo.getName());

            System.out.println("学生的年龄为：" + stuInfo.getAge());
        }

        testRemove();
    }

    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>();

        list.add("test");
        list.add("test");
        list.add("111");
        list.add("222");
        list.add("test");
        list.add("test");
        list.add("000");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("test".equals(s)) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    private static Student getStudent() {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");

        String name = sc.next();

        System.out.println("请输入学生年龄：");

        int age = sc.nextInt();

        Student stu = new Student(name,age);

        return stu;
    }
}

