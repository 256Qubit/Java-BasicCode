import  java.util.Random;
import  java.util.Scanner;

public class Democaishuzi {
    public static void main(String[] args) {
        Random r = new Random();

        Scanner sc = new Scanner(System.in);

        int randomNum = r.nextInt(100)+1;

        System.out.println(randomNum);

        while (true){
            System.out.println("请输入数字：");

            int num = sc.nextInt();

            if(num>randomNum){

                System.out.println("猜大了");

            }

            else if (num<randomNum)

            {
                System.out.println("猜小了");
            }

            else {
                System.out.println("猜对了");
                break;
            }

        }

    }
}
