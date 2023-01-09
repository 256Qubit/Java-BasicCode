package com.methodtest.mode;

public class demo13method {
    public static void main(String[] args) {
        int[] arr={546,956,365,889,654,236,785};
        int max=getmax(arr);
        System.out.println(max);
        int[] maxAndmin = getmaxAndmin(arr);
        System.out.println(maxAndmin[0]);
        System.out.println(maxAndmin[1]);
    }
    public static int getmax(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static int[] getmaxAndmin(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        int[] getmaxAndmin = {max,min};
        return getmaxAndmin;
    }

}
