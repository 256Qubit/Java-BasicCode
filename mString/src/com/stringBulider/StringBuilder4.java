package com.stringBulider;

/*
      成员方法:
            public StringBuilder append(任意类型) : 添加数据，并返回对象本身
            public StringBuilder reverse() : 返回相反的字符序列
            public int length​() : 返回长度 (字符出现的个数)
            public String toString() : 通过toString()就可以实现把StringBuilder转换为String
   */

public class StringBuilder4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        StringBuilder tk = new StringBuilder();

        StringBuilder sb1 = sb.append("123");

        StringBuilder sb2 = sb.append("456");

        StringBuilder sb3 = tk.append("123").append("456").append("789");

        System.out.println(sb);

        System.out.println(sb1);

        System.out.println(sb2);

        System.out.println(sb==sb1);

        System.out.println(sb1==sb2);

        System.out.println(sb3);

        tk.reverse();

        System.out.println(tk);

        System.out.println(tk.length());

        String s = tk.toString();

        System.out.println(s);
    }
}
