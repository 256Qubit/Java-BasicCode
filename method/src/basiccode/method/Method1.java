package basiccode.method;
/*
  方法的定义格式：

  public static void 方法名（）{
  方法体;
  }

  方法的调用格式：
  方法名（）;

注意：方法与方法之间为平级关系不能嵌套定义。


 */


import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        eat();
        study();
        method();
    }

    public static void eat(){
        study();
        System.out.println("吃饭");
    }
    public static void study(){
        System.out.println("学习");
    }
    public static void method(){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数字：");

        int num = sc.nextInt();

        if(num% 2==0)
        {
            System.out.println("偶数");
        }
        else {
            System.out.println("奇数");
        }
    }

}
