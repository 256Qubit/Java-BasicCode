package com.stringBulider;

public class StringBulider1 {
    public static void main(String[] args) {

        /*

        StringBuilder 常用构造方法：

        StringBuilder()

          构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。

          public StringBuilder()：构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。

        StringBuilder(CharSequence seq)

          构造一个字符串生成器，它包含与指定的 CharSequence 相同的字符。

          public StringBuilder(int capacity)：构造一个不带任何字符的字符串生成器，其初始容量由 capacity 参数指定。

         */

        method();

        long start = System.currentTimeMillis();

        StringBuilder s = new StringBuilder();

        for (int i = 1; i < 50000; i++) {
            s.append(i);
        }

        System.out.println(s);

        long end = System.currentTimeMillis();

        System.out.println("需要时间为："+(end-start));
    }

    private static void method() {
        long start = System.currentTimeMillis();


        String s = "";

        for (int i = 1; i < 50000; i++) {

            s += i;

        }

        System.out.println(s);

        long end = System.currentTimeMillis();

        System.out.println("运行时间为："+(end-start));
    }
}
