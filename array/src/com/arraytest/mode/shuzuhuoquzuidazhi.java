package com.arraytest.mode;

public class shuzuhuoquzuidazhi {
    public static void main(String[] args) {
        int[] arr = {565, 59959, 3356, 3123, 15648, 64458, 4532};

        int max = arr[0];

        for (int i = arr[1]; i < arr.length; i++) {
            if (arr[i] >max) {
                max = arr[i];
            }

        }

        System.out.println("max:"+max);
    }
}

