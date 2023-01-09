package com.object2;

public class Testmaxmin {
    public static void main(String[] args) {

        maxmin mx = new maxmin();

        mx.setArr();


        int[] arr = mx.gatmaxAndmin();

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {

                System.out.println("该数组最小值为："+arr[0]);
            }

            else {

                System.out.println("该数组最大值为："+arr[1]);

            }

        }
    }
}
