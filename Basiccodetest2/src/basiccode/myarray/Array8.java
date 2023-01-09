package basiccode.myarray;

import java.util.Scanner;

public class Array8 {

    public static void main(String[] args) {

        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++)

        {

            System.out.println("请输入第"+(i+1)+"个评委打分：");

            int score = sc.nextInt();

            if(score>=0 && score<=100)

            {
                arr[i]=score;
            }
            else
            {
                System.out.println("您的输入有误，请重新输入。");

                i--;

            }

        }

        int max =arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

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

        int avg =(sum-max-min)/(arr.length-2);
        System.out.println(avg);

    }
}
