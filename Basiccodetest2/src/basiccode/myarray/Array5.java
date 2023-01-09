package basiccode.myarray;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{290,90,289,210,578,378,378,290};

        int max = arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max:"+max);
    }
}
