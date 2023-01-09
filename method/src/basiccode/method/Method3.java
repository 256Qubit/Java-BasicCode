package basiccode.method;

public class Method3 {
    public static void main(String[] args) {
        nm(10,20);
    }

    public static void nm(int n,int m){

        System.out.println(n+"到"+m+"之间的奇数为：");

        for (int i = n; i <m ; i++) {
            if(i%2 ==1){
                System.out.println(i);
            }
        }
    }

}
