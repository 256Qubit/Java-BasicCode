package com.methodtest.mode;

/*

方法的定义格式：

public static void 方法名（）
{
方法体
}

方法调用的格式：

方法名（）；

注意：方法与方法之间是平级关系，不能嵌套定义。
 */

public class Demo1method {
    public static void main(String[] args) {
        eat();
        study();
    }

    public static void eat()
    {

        System.out.println("吃饭");
    }
    public static  void study()
    {
        System.out.println("学习");
    }
}
