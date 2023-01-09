package com.arraytest.mode;

import java.util.Scanner;

public class shuzuchazhao {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您要查找的元素：");

        int num = sc.nextInt();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (num == arr[i])
            {
                index = i;
                break;
            }
        }
        System.out.println(index);
        //代码执行过程：键盘输入数字。对比数组位置为0 的数字，
        // 相同调入if语句中继续执行。index = i【将i的值赋给index】;break;结束
        //数字不相同，不调入if语句。继续执行for循环。

    }
}
