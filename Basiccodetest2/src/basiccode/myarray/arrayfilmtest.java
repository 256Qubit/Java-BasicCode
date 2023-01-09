package basiccode.myarray;

import java.util.Scanner;

public class arrayfilmtest {
    public static void main(String[] args) {

        int[] arr = new int[6];

        Scanner sc =new Scanner(System.in);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("请第"+(i+1)+"位评委输入成绩：");
            int score = sc.nextInt();

            if(score>=0&&score<=100) {
                arr[i]=score;
            }

            else{
                i--;
                System.out.println("您的输入有误！");
            }
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min =arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }

        int avg = (sum-max-min)/(arr.length-2);
        System.out.println("最终得分为："+avg);

    }
}
