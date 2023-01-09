package com.string;

public class Demo4String {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 = "ABC";
        String  s3 ="abc";

        boolean b = s1.equals(s2);
        System.out.println(b);

        boolean c = s2.equals(s3);
        System.out.println(c);

        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
