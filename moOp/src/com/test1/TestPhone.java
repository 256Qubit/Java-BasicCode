package com.test1;

public class TestPhone {
    public static void main(String[] args) {
        //1.创建对象

        //2.给成员变量进行赋值

        //3.打印赋值后的成员变量

        //4.调用成员方法

        Phone p = new Phone();
        p.brand = "iphone";
        p.price = 8999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call("sam");
        p.sendMessage("Tom");

    }
}
