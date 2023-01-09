package com.methodtest.mode;

public class demo7method {
    public static void main(String[] args) {
        int num = max(10,30);
        System.out.println(num);
        int maxnum = getMax(50,35);
        System.out.println(maxnum);
        System.out.println(getMax(50,35));
        for (int i = 0; i <maxnum; i++) {
            System.out.println("hello world");
        }
    }
    public static int max(int a,int b)
    {
        int c = 0;
            if(a>b)
            {
                c = a;
            }
            else
            {
                c = b;
            }
        return c;
    }
    public static int getMax(int c,int d)
    {
        if(c>d){
            return c;
        }
        else{
            return d;
        }
    }
}
