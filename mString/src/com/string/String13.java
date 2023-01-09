package com.string;

import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        String s = sc.nextLine();

        int datatype1 = 0;
        int datatype2 = 0;
        int datatype3 = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = chars[i];
            if (c >= 'A'&&c<='Z') {
                datatype1++;
            } else if (c >= 'a'&&c<='z') {
                datatype2++;
            } else if (c>='0'&&c<='9') {
                datatype3++;
            }
        }
        System.out.println("字符串中【大写字母】字符数为："+datatype1);
        System.out.println("字符串中【小写字母】字符数为："+datatype2);
        System.out.println("字符串中【数字】字符数为："+datatype3);
    }
}
