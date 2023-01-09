package basiccode.method;

import java.util.Scanner;

public class method8test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入数组之中第"+(i+1)+"个数据：");

            int text = sc.nextInt();
            arr[i] = text;
        }
        int max = getMax(arr);
        System.out.println("该数组最大值为："+max);
        int min = getMin(arr);
        System.out.println("该数组最小值为："+min);
        int[] maxmin = getmaxAndmin(arr);
        System.out.print("[");
        for (int i = 0; i <maxmin.length; i++) {
            if(i == maxmin.length-1){
                System.out.println("arr数组的最大值为："+maxmin[i]+"]");
            }
            else{
                System.out.print("arr数组的最小值为："+maxmin[i]+", ");
            }
        }

    }

    public static int getMax(int[] arr){
     int max = arr[0];
        for (int i =1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int[] getmaxAndmin(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int[] maxAndmin = new int[]{min,max};
        return maxAndmin;
    }
}
