package basiccode.method;

/*
带返回值方法的定义格式：

public static 数据类型 方法名（参数）
{
return 数据;
}
注意：方法定义时return后面的返回值与方法定义上的数据类型要匹配，否则程序将报错

带返回值方法的调用格式：

数据类型 变量名 = 方法名（参数）;

 */
public class Method4 {
    public static void main(String[] args) {

        int num = add(10,20);

        System.out.println(num);

        int max = getMax(99,91);

        System.out.println(max);

        for (int i = 0; i < max; i++) {

            System.out.println("hello world");
        }

    }

    public static int add(int a,int b){

        int c=a+b;

        return c;
    }

    public static int getMax(int num1,int num2)

    {
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }

    }


}
