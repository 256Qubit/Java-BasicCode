package com.arraytest.mode;

import java.util.Scanner;

public class qiushuliehe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int[] arr = new int[5];

        for(int i = 0;i<arr.length;i++)
        {
            System.out.println("请输入第"+(i+1)+"个整数：");
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum:"+sum);
    }
}
