package com.stringBulider;

public class StringBuiilder7 {
    public static void main(String[] args) {
        int[] arr = new int[]{88,99,0,11,22,33};

        String s = nm(arr);

        System.out.println(s);

    }
    public static String nm(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]).append("]");
            } else  {
                sb.append(arr[i]).append(",");
            }

        }
        return sb.toString();
    }
}
