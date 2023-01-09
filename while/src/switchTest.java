import java.util.Scanner;

public class switchTest {
    public static void main(String[] args) {
        lo:while (true) {

            System.out.println("【按0退出】");

            System.out.println("请输入星期数：");

            Scanner sc = new Scanner(System.in);

            int week  = sc.nextInt();

            switch (week) {
                case 0:
                    System.out.println("感谢您的使用！");
                    break lo;
                case 1:
                    System.out.println("跑步");
                    break;

                case 2:
                    System.out.println("深蹲");
                    break;

                case 3:
                    System.out.println("硬举");
                    break;

                case 4:
                    System.out.println("仰卧起坐");
                    break;

                case 5:
                    System.out.println("游泳");
                    break;

                case 6:
                    System.out.println("做操");
                    break;

                case 7:
                    System.out.println("休息");
                    break;

                default:
                    System.out.println("您的输入有误。");
                    break;
            }
        }
    }
}
