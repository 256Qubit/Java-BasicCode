package com.array;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("test");
        list.add("张三");
        list.add("王五");
        list.add("王二麻子");
        list.add("test");
        list.add("test");

        for (int i = 0; i < list.size(); i++) {

            String s = list.get(i);

            if ("test".equals(s)) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
