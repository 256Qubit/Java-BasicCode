package com.array;

import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        testGet();
        testSet();
        testRemove();
    }

    private static void testGet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");

        String set = list.set(0, "000");
        System.out.println(set);

        System.out.println(list);
    }

    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");
        boolean b1 = list.remove("aaa");
        boolean b2 = list.remove("ccc");

        System.out.println(b1);

        System.out.println(b2);

        System.out.println(list);

        String remove = list.remove(0);

        System.out.println(remove);

        System.out.println(list);
    }
}
