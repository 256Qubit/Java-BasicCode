package com.arraytest.mode;

import java.util.Scanner;

public class pingweidafentest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[6];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第"+arr.length+"位评委输入分数");
            int score = sc.nextInt();
            if(score >=0 &&score<=100)
            {
                arr[i] = score;
            }
            else {
                System.out.println("您的输入有误，请重新输入！！！");
                i--;
            }


        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        int avg = (sum-max-min)/(arr.length-2);
        System.out.println(avg);
        System.out.println("去掉一个最高分，去掉一个最低分，最终得分为"+avg+"恭喜!!!");
    }
}
