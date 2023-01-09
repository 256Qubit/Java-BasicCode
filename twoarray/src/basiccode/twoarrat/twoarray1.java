package basiccode.twoarrat;

public class twoarray1 {
    public static void main(String[] args) {
        int[][] arr =new int[3][3];

        System.out.println(arr);
        /*
        二维数组存储一维数组时，存储的是一维数组的内存地址
         */

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
