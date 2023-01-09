package com.string;

public class Demo1String {
    public static void main(String[] args) {
        String s1 = "sshhqoo";
        int length = s1.length();
        System.out.println(length);

        s1 = "def";//这一步是让s1这个字符串类型的变量，记录了一个新的对象
        System.out.println(s1);
    }
}
