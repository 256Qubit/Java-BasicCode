package com.methodtest.mode;

public class demo11method {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        System.out.println("调用change前arr[1]数值："+arr[1]);
        change(arr);
        System.out.println("调用change后arr[1]数值："+arr[1]);
        int number = 100;
        System.out.println("调用change前number数值："+number);
        change(number);
        System.out.println("调用change后number数值："+number);
        System.out.println("调用change后number数值："+ change(number));

    }
    public static int change(int number){
        number = 200;
        return number;
    }
    public static void change(int[] arr){
        arr[1]=200;
    }
}
