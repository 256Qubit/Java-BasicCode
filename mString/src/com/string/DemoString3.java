package com.string;
/*
使用 == 作比较

基本类型：比较的是【数据值】是否相同

引用类型：比较的是【地址值】是否相同
 */

public class DemoString3 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2+"c";

        System.out.println(s1==s3);

        nm();

        mn();
    }
    public static void nm(){
        String s4 = "abc";
        String s5 = "abc";

        System.out.println(s4==s5);
    }
    public static void mn(){
        String s6 = new String("abc");
        String s7 = new String("abc");

        System.out.println(s6==s7);
    }

}
