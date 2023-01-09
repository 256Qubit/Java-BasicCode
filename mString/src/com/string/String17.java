package com.string;

import com.domain.remarks;

import java.util.Scanner;

public class String17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        String s= sc.nextLine();

        remarks s1 = new remarks();

        s1.setRemark(s);

        String replace = s1.getRemark().replace("TMD", "***");

        System.out.println(replace);

    }
}
