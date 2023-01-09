package com.methodtest.mode;

 /*

        带参数方法的定义格式:
                public static void 方法名  ( 参数 )  { … … }
                public static void 方法名  ( 数据类型 变量名 )  { … … }

        带参数方法的调用格式:
                方法名 ( 参数 ) ;
                方法名 ( 变量名/常量值 ) ;

        tips: 参数可以是一个, 也可以是多个.

        需求: 判断一个数是奇数还是偶数
     */

public class demo4method {
    public static void main(String[] args) {
        isEvennumber(5);

    }
    public static void isEvennumber(int num) {
        if(num%2 ==0) {
            System.out.println("偶数");
        }
        else{
            System.out.println("奇数");
        }
    }
}
