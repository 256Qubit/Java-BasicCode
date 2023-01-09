package basiccode.method;

public class Method2 {
    public static void main(String[] args) {
        isEvenNumber(10);//实际参数，方法调用中的参数

        int number = 10;
        isEvenNumber(number);
    }
    public static void isEvenNumber(int number)//方法中number 没有被实际调用是方法定义之中的参数称为形参
    {
        if(number% 2==0)
        {
            System.out.println("偶数");
        }
        else {
            System.out.println("奇数");
        }
    }
}
