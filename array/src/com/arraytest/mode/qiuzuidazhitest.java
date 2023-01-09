package com.arraytest.mode;

import java.util.Scanner;

public class qiuzuidazhitest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int[] arr = new int[5];



        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个整数");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println("计算数值为："+sum);
 /*
        int i = 0;
        while(i<5)
        {

            System.out.println("请输入第"+(i+1)+"个整数");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("计算数值为："+sum);
*/
    }
}
