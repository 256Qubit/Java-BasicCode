package com.Test2;

public class Student2 {
    private String name;

    public void setName(String name){

        this.name = name;
    }
    public String getName(){
        return name;
    }


    private int age;

    public void setAge(int age){
        if(age >=0&&age<=100){
            this.age = age;
        }
        else {
            System.out.println("数据有误");
        }

    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name+"....."+age);
    }



}
