package com.object2;


import java.util.Scanner;

public class maxmin {

    private int[] arr = new int[5];

    public  void setArr(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数组元素：");
            int text = sc.nextInt();
            arr[i] = text;
        }

        this.arr = arr;
    }

    public int[] getArr(){

        return arr;
    }

    public  int[] gatmaxAndmin() {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        int[] maxAndmin =new int[]{min,max};
        for (int i = 0; i < maxAndmin.length; i++) {
            System.out.println(maxAndmin[i]);
        }
        return maxAndmin;

    }
}
