package com.stringBulider;

public class StringBulider3 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 50000; i++) {
            s.append(i);
        }

        long eng = System.currentTimeMillis();

        System.out.println(eng-start);

        method();

    }

    private static void method() {
        long start = System.currentTimeMillis();

        String s="";

        for (int i = 0; i < 50000; i++) {

            s +=i;

        }

        System.out.println();

        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
