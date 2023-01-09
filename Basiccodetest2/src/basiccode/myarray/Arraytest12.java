package basiccode.myarray;

import java.util.Scanner;

public class Arraytest12 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        Scanner tx =new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数组数据");
            int input = tx.nextInt();
            arr1[i]=input;
        }
        for (int i = 1; i < arr1.length; i++) {
            //4. 定义一个内存for循环数组比较的轮数，要比外一层少n-1轮
            for (int j = 0; j < arr1.length-i; j++) {
                if (arr1[j] > arr1[j+1]){
                    //下面三行用于相邻的两个元素交换
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if(i == arr1.length-1){
                System.out.println(arr1[i]+"]");}
            else{
                System.out.print(arr1[i]+",");
            }
        }
    }

}

