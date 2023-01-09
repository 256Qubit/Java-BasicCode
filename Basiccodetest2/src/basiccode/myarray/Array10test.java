package basiccode.myarray;

import java.util.Random;
import java.util.Scanner;

public class Array10test {
    public static void main(String[] args) {

        int[] id = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < id.length; i++) {

            System.out.println("请输入具体内容：");

            int exctid = sc.nextInt();

            id[i]=exctid;
        }

        Random random = new Random();

        for (int i = 0; i < id.length; i++) {

            int index = random.nextInt(id.length);

            int temp =id[index];
            id[index]=id[i];
            id[i]=temp;

        }

        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i]);

        }
        sc.close();
    }
}
