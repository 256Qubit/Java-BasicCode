package com.stringBulider;

import java.util.Scanner;

public class StringBuilder5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        String reverse = sb.toString();

        if (s.equals(reverse)){
            System.out.println("你输入的内容是【对称字符串】。");
        }
        else {
            System.out.println("您输入的内容不是【对称字符串】");
        }
    }
}
