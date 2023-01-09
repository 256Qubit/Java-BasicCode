package com.stringBulider;

public class StringBuilder2 {
    /*

        StringBuilder 常用构造方法：

        StringBuilder()

          构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。

          public StringBuilder()：构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。

        StringBuilder(CharSequence seq)

          构造一个字符串生成器，它包含与指定的 CharSequence 相同的字符。

          public StringBuilder(int capacity)：构造一个不带任何字符的字符串生成器，其初始容量由 capacity 参数指定。

         */
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();

        System.out.println(s);

        StringBuilder s1 = new StringBuilder("avi");

        System.out.println(s1);

    }
}
