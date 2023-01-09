package basiccode.myarray;

//静态初始化：初始化时。就可以指定数组要存储的元素，系统还会自动计算出该数组的长度。
//格式：数据类型 数组名 = new 数据类型[]{数据1，数据2，数据3.....}

public class Array4 {
    public static void main(String[] args) {
        int[] arr = new int[]{11,22,33};

        //int[] arr ={11.22,33};//简化写法：只是简化了new int[]写法，执行时系统会自动补上。
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
