package com.test;

import com.domain.Student;

import javax.print.attribute.standard.Sides;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        lo:while (true){
            System.out.println("--------欢迎来到学生管理系统--------");

            System.out.println("1 添加学生");

            System.out.println("2 删除学生");

            System.out.println("3 修改学生");

            System.out.println("4 查看学生");

            System.out.println("5 退出");

            System.out.println("请输入您的选择:");

            String choice = sc.next();

            switch (choice){
                case "1":
                    System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case "4":
                    System.out.println("查看学生");
                    queryStudents(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用!");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;

            }
        }

    }

    public static void queryStudents(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("无信息，请添加后再进行查看");
            return;
        }
        System.out.println("学号    姓名    年龄    生日");
        for (int i = 0; i < list.size(); i++) {

            Student stu =list.get(i);
            System.out.println(stu.getSid()+"    "+stu.getName()+"    "+stu.getAge()+"    "+stu.getBirthday());
        }
    }

    public static int getIndex(ArrayList<Student> list,String Sid){
        // 1. 假设传入的学号, 在集合中不存在

        int index = -1;
        for (int i = 0; i < list.size(); i++) {

            Student stu =list.get(i);
            String id = stu.getSid();
            if (id.equals(Sid)){
                index = i;
            }
        }
        return index;
    }
    public static void updateStudent(ArrayList<Student> list) {

        System.out.println("请输入您要修改的学生学号：");

        Scanner sc = new Scanner(System.in);

        String updateSid = sc.next();

        int index = getIndex(list, updateSid);

        if (index == -1) {
            System.out.println("输入有误，没有当前学号的学生。");
        }
        else {
            System.out.println("请输入学生姓名：");

            String name = sc.next();

            System.out.println("请输入学生年龄：");

            int age = sc.nextInt();

            System.out.println("请输入学生生日：");

            String birthday = sc.next();

            Student stu = new Student(updateSid,name,age,birthday);

            list.set(index,stu);

            System.out.println("添加成功");
        }

    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        String deleteSid = sc.next();

        int index = getIndex(list, deleteSid);
        if (index == -1) {
            System.out.println("输入有误，没有当前学号的学生。");
            return;
        }
        else {
            list.remove(index);
            System.out.println("删除成功");
        }

    }

    public static void addStudent(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        String Sid;
        while (true) {
            System.out.println("请输入学生学号：");

            Sid = sc.next();

            int index = getIndex(list, Sid);

            if (index == -1) {
                break;
            }
        }
        System.out.println("请输入学生姓名：");

        String name = sc.next();

        System.out.println("请输入学生年龄：");

        int age = sc.nextInt();

        System.out.println("请输入学生生日：");

        String birthday = sc.next();

        Student stu = new Student(Sid,name,age,birthday);

        list.add(stu);

        System.out.println("添加成功");

    }
}
