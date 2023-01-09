import java.util.Random;//导包
//需求：产生1-10的随机数random(10)产生0-9的随机数不包含10
public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random();//创建对象
        for(int i =0;i<=10;i++) {
            int num = r.nextInt(10)+1;
            System.out.println(num);
            /*int num = r.nextInt(10);
            System.out.println(num);
            */

        }//0-9 获取随机数

    }
}
