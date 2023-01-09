package basiccode.myarray;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int sum = 0;

        for(int i=0;i<arr.length;i++){

            System.out.println("请输入第"+(i+1)+"个数据：");
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++)
        {
            sum +=arr[i];
        }
        System.out.println("总数相加结果为："+sum);
    }
}
