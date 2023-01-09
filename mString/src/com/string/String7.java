package com.string;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);//将字符串中每个字符逐个遍历出来，然后用c接受

            System.out.println(c);//逐个打印

        }
        mn();
    }
    public static void mn(){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        String s = sc.nextLine();

        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            System.out.println(chars[i]);
        }
    }
}
