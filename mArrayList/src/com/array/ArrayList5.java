package com.array;

import com.domain.Student;

import java.util.ArrayList;

/*
       需求：定义一个方法，方法接收一个集合对象（泛型为Student）
           方法内部将年龄低于18的学生对象找出
           并存入新集合对象，方法返回新集合。

       思路：
           1. 定义方法，方法的形参定义为ArrayList<Student> list
           2. 方法内部定义新集合，准备存储筛选出的学生对象 ArrayList<Student> newList
           3. 遍历原集合，获取每一个学生对象
           4. 通过学生对象调用getAge方法获取年龄，并判断年龄是否低于18
           5. 将年龄低于18的学生对象存入新集合
           6. 返回新集合
           7. main方法中测试该方法
    */
public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三1",19);
        Student stu2 = new Student("张三2",18);
        Student stu3 = new Student("张三3",20);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        ArrayList<Student> newList = getList(list);

        for (int i = 0; i < newList.size(); i++) {

            Student stu = newList.get(i);

            System.out.println(stu.getName() + "..." + stu.getAge());
        }

    }


    public static ArrayList<Student> getList(ArrayList<Student> list){

        ArrayList<Student> newlist = new ArrayList<>();

        for (int i = 0; i < newlist.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            if(age>18){
                newlist.add(stu);
            }
        }
        return newlist;
    }
}
