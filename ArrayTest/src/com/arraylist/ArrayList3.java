package com.arraylist;

import com.domain.Student;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",22);
        Student stu3 = new Student("王五",21);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("学生的姓名为："+stu.getName());
            System.out.println("学生的年龄为："+stu.getAge());
        }
    }
}
