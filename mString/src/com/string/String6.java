package com.string;

import java.util.Scanner;

public class String6 {
    /*
      需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串

      思路：
      1. 键盘录入一个字符串，用 Scanner 实现
      2. 遍历字符串，首先要能够获取到字符串中的每一个字符
          public char charAt​(int index)：返回指定索引处的char值，字符串的索引也是从0开始的
      3. 遍历字符串，其次要能够获取到字符串的长度
          public int length​()：返回此字符串的长度
      4. 遍历打印
9
   */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            System.out.println(c);
        }

        nm();
    }
    public static  void nm(){
/*
       需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串

       思路：
       1. 键盘录入一个字符串，用 Scanner 实现
       2. 将字符串拆分为字符数组
                public char[] toCharArray​( )：将当前字符串拆分为字符数组并返回
       3. 遍历字符数组

    */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        String  s = sc.nextLine();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
