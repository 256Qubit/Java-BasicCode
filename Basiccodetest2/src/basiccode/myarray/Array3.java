package basiccode.myarray;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = new int[2];
        arr1[0]=11;
        arr1[1]=22;

        int[] arr2 = arr1;//堆内存之中不会开辟新的空间
        arr2[0]=33;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}
