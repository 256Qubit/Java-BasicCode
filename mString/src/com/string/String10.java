package com.string;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的手机号：");

        String s = sc.nextLine();

        String substring = s.substring(3);

        System.out.println(substring);

        String substring1 = s.substring(0, 8);

        System.out.println(substring1);

        mt();

    }

    public static void mt(){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的手机号：");

        String s = sc.nextLine();

        String start = s.substring(0, 3);

        String end = s.substring(7);

        String s1 = start+"****"+end;

        System.out.println(s1);

        System.out.println(start+"****"+end);
    }
}
