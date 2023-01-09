package com.methodtest.mode;

public class demo10method {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用前number数值："+number);
        change(number);
        System.out.println("调用后number数值："+number);
    }
    public static void change(int number)
    {
        number=200;
    }
}
