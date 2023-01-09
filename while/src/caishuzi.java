import java.util.Random;
import java.util.Scanner;

public class caishuzi {
    public static void main(String[] args) {
        //准备Random和Scanner对象，分别用于产生随机数和键盘录入
        Random r =new Random();

        Scanner sc =new Scanner(System.in);

        int randomNum = r.nextInt(100)+1;//使用Random随即生成一个1-100之间的数字，作为要猜的数字
         while (true) {
             System.out.println("请输入数字：");
             int num = sc.nextInt();

             if (num > randomNum) {

                 System.out.println("猜大了");
             }

             else if (num < randomNum) {

                 System.out.println("猜小了");
             }
             else
             {
                 System.out.println("恭喜猜中了");
                 break;
             }
         }
    }
}
