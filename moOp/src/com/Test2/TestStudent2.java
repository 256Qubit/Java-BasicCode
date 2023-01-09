package com.Test2;

public class TestStudent2 {

    public static void main(String[] args) {

        Student2 stu2 = new Student2();

        stu2.setName("jack");

        stu2.setAge(18);

        System.out.println(stu2.getName());

        System.out.println(stu2.getAge());

        int age = stu2.getAge();

        for (int i = 0; i < age; i++) {
            System.out.println("happy birthday!!!");
        }

        stu2.show();
    }
}
