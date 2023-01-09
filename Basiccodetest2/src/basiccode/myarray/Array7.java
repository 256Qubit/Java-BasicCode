package basiccode.myarray;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {

        int[] arr = new int[]{298,2918,5783,29210,2910};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的数据：");
        int num = sc.nextInt();
        int index = -1;

        for(int i =0;i<arr.length;i++){
            if(num == arr[i]){
                index =i;
                break;
            }
        }
        System.out.println(index);
    }
}
