public class Demoupate2 {
    public static int i;

    public static void main(String args[]) {
        for (init(); i < 3; update()) {
            System.out.println("这是一个循环");
        }
    }

    public static void init() {
        i = 0;
        System.out.println("这是初始化函数");
    }


    public static void update() {
        i++;
        System.out.println("这是更新函数");
    }

}
