package com.methodtest.mode;

public class demo6method {
    public static void main(String[] args) {
        print(10 ,200);

    }
    public static void print(int n,int m){
        if(n>m)
        {
            System.out.println("您传入的参数有误，请检查后重新输入");
            return;//return；可以用于结束方法，将该方法从栈内存中弹出去，该过程称为方法的弹栈。
            //System.out.println();
            // ruturn;下方的代码无法执行。
        }
        System.out.println(n+"到"+m+"之间的奇数为： ");
        for (int i = n; i < m; i++) {
            if(i % 2 ==1)
            {
                System.out.println(i);
            }
            
        }
    }
}
