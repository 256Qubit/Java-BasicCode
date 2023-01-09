package basiccode.method;

public class Method9 {
    public static void main(String[] args) {
        int[] arr = new int[]{98,89,90,00,99};

        /*int start= 0;
        int end = arr.length-1;
        for(;start<end;start++,end--)*/

        for (int start = 0,end=arr.length-1; start<=end; start++,end--) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
