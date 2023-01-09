package com.arraytest.mode;

/*
        需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
                选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。

        思路：
            1.定义一个数组，用动态初始化完成数组元素的初始化，长度为6
            2.键盘录入评委分数
            3.由于是6个评委打分，所以，接收评委分数的操作，用循环
            4.求出数组最大值
            5.求出数组最小值
            6.求出数组总和
            7.按照计算规则进行计算得到平均分
            8.输出平均分

     */

import java.util.Scanner;

public class pingweidafen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int[] arr = new int[6];


//3.由于是6个评委打分，所以，接收评委分数的操作，用循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i + 1) + "位评委输入分数：");
            int score = sc.nextInt();//2.键盘录入评委分数

            if(score >=0 && score<=100) {
                arr[i] =score;//将score的值赋给数组

            }
            else
            {
                System.out.println("您的打分输入有误，请检查分数是否在0~100之间！");
                i--;//输入错误后有第二次输入机会。
            }
        }
        // 4.求出数组最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i])
            {
               max = arr[i];
            }
        }
//5.求出数组最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(min>arr[i])
            {
                min = arr[i];
            }

        }
//6.求出数组总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        //7.按照计算规则进行计算得到平均分
        int avg = (sum - max- min)/(arr.length-2);
//8.输出平均分
        System.out.println("经过评委们的打分！去掉一个最高分，去掉一个最低分，最后综合评分为："+avg);
        System.out.println("恭喜！！！"); 

    }
}
