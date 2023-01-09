package com.array;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        list.add("4");
        list.add("5");
        list.add(0,"abc");

        String s1 = list.get(0);
        String s2 = list.get(1);
        String s3 = list.get(2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        int size = list.size();
        System.out.println(size);


    }

    private static void method1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        list.add("4");
        list.add("5");
        list.add(0,"abc");

        String s = list.set(0, "0");
        System.out.println(s);

        System.out.println(list);
    }

    private static void method() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        list.add(0,"4");
        boolean b1 = list.remove("1");
        boolean b2 = list.remove("5");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(list);

        String s = list.remove(0);
        System.out.println(s);

        System.out.println(list);
    }
}
