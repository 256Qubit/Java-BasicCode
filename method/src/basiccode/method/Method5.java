package basiccode.method;

public class Method5 {
    public static void main(String[] args) {
        nm(20,100);

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
}
