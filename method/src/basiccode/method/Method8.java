package basiccode.method;

public class Method8 {
    public static void main(String[] args) {
        int[] arr = new int[]{39,48,553,1256,7731,3455};
        int min = getMin(arr);
        System.out.println(min);
        int max =getMax(arr);
        System.out.println(max);
        int[] maxmin = getmaxAndmin(arr);
        System.out.print("[");
        for (int i = 0; i <maxmin.length; i++) {
            if(i == maxmin.length-1){
                System.out.println("arr数组的最大值为："+maxmin[i]+"]");
            }
            else{
                System.out.print("arr数组的最小值为："+maxmin[i]+",");
            }
        }

    }
    public static int getMax(int[] arr){
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
            }
        return min;
        }

    public static int[] getmaxAndmin(int[] arr){
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min =arr[i];
            }
        }
        int[] maxAndmin = new int[]{min,max};
        return maxAndmin;
    }

}
