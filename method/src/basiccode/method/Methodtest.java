package basiccode.method;

public class Methodtest {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("改变前number："+number);
        int number1=change(number);
        System.out.println("改变后number:"+number1);
        int[] arr =new int[]{10,20,30};
        System.out.println("改变前数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] chang =change(arr);
        System.out.println("改变后数组为：");
        for (int i = 0; i < chang.length; i++) {
            System.out.println(chang[i]);
        }
        changearr(arr);
        System.out.println("第二次改变后数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int change(int number) {
        number = 200;
        return number;
    }
    public static int[] change(int[] arr){
        arr[1]=200;
        return arr;
    }
    public static void changearr(int[] arr){

        arr[1]=200;
    }

}
