package com.Random;

import java.util.Random;
import java.util.Scanner;

public class Demo1Random {
    public static void main(String[] args) {
        Random s = new Random();
        int i = s.nextInt(10);
        System.out.println(i);
        nm();

    }
    public static void nm(){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int i = r.nextInt(100) + 1;
        lo:while (true){
            System.out.println("请输入一个数字：");
            int num = sc.nextInt();
            if(num>i){
                System.out.println("猜大了");
            } else if (num<i) {
                System.out.println("猜小了");
            }
            else {
                System.out.println("猜中了");
                break lo;
            }
        }
    }
}
