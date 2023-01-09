package basiccode.myarray;

import java.util.Random;
import java.util.Scanner;

public class Arraytest {
    public static void main(String[] args) {

        int[] arr = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            System.out.println("请输入具体内容：");

            int text = sc.nextInt();

            arr[i]=text;

        }
        Random random =new Random();
        for (int i = 0; i < arr.length; i++) {

            int index = random.nextInt(arr.length);

            int temp = arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        sc.close();

    }
}
