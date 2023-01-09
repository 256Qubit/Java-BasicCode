package basiccode.method;

public class Method7 {
    public static void main(String[] args) {
        int[] t = new int[]{10,20,30,40,50,60,70,80};
        arrayPrint(t);
        System.out.println(compare(0.7,10));
        long start = System.currentTimeMillis();
        nm(30,80);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void arrayPrint(int[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.println(arr[i]+"]");
            }
            else{
                System.out.print(arr[i]+",");
            }

        }
    }
    public static boolean compare(int a,int b){
        return a ==b;
    }
    public static boolean compare(long a,long b){
        return a ==b;
    }
    public static boolean compare(short a,short b){
        return a ==b;
    }
    public static boolean compare(byte a,byte b){
        return a ==b;
    }
    public static boolean compare(char a,char b){
        return a ==b;
    }
    public static boolean compare(float a,float b){
        return a ==b;
    }
    public static boolean compare(double a,double b){
        return a ==b;
    }
    public static void nm(int n,int m){
        if(n>m){

            System.out.println("输入有误！");

            return;

        }

        System.out.println(n+"到"+m+"之间的奇数为：");

        for (int i = n; i <m ; i++) {

            if(i%2==1){

                System.out.println(i);
            }

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
