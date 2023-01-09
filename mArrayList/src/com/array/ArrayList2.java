package com.array;

import com.domain.Student;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三1",23);
        Student stu2 = new Student("张三2",23);
        Student stu3 = new Student("张三3",23);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }
    }

    private static void method1() {
        ArrayList<String> list =new ArrayList<>();

        list.add("marry");
        list.add("jack");
        list.add("tom");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
