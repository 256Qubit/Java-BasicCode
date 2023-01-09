package basiccode.myarray;

import java.util.Scanner;

public class Array9test {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            System.out.println("请第"+(i+1)+"个评委输入分数：");

            int score = sc.nextInt();

            if(score>=0&&score<=100)
            {
                arr[i]=score;
            }
            else{
                System.out.println("您的输入有误！");
                i--;
            }

        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<min){
                min = arr[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }

        int avg = (sum-max-min)/(arr.length-2);

        System.out.println("去掉一个最高分，去掉一个最低分，最后得分为："+avg);

    }
}
