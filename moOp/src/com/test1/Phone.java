package com.test1;

public class Phone {
    String brand;
    int price;
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage(String name){
        System.out.println("给"+name+"发短信");
    }
}
