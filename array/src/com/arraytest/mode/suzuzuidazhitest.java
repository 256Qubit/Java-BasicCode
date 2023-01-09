package com.arraytest.mode;

public class suzuzuidazhitest {
    public static void main(String[] args) {
        int[] arr = new int[]{566,595,254,654,684,4546};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max= arr[i];
            }
        }
        System.out.println("数组中的最大值为："+max);
    }
}
