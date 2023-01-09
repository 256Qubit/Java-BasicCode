package com.string;

import java.util.Scanner;

/*
       需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)

       思路：
       1. 键盘录入一个字符串，用 Scanner 实现
       2. 要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
       3. 遍历字符串，得到每一个字符
       4. 判断该字符属于哪种类型，然后对应类型的统计变量+1
               假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围即可
               大写字母：ch>='A' && ch<='Z'
               小写字母： ch>='a' && ch<='z'
               数字： ch>='0' && ch<='9'
       5. 输出三种类型的字符个数
    */
public class String8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        String s = sc.nextLine();

        int bigCount = 0;

        int smallCount = 0;

        int number = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if(c>='A' && c<='Z'){
                bigCount++;
            } else if (c>='a'&&c<='z') {
                smallCount++;

            } else if (c>='0'&&c<='9') {

                number++;

            }
        }

        System.out.println("大写字母字符个数为："+bigCount);

        System.out.println("小写字母字符个数为："+smallCount);

        System.out.println("数字字符个数为："+number);

        nm();
    }

    public static void nm(){

        Scanner sc = new Scanner(System.in);

        int count = 0;

        int zf = 893490;

        double paper = 0.1;

        while (paper<=zf){

            paper *= 2;

            count++;
        }
        System.out.println(paper);

        System.out.println(count);

    }
}
