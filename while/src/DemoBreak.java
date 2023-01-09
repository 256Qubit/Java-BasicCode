public class DemoBreak {
    public static void main(String[] args) {
        /*
        break中止循环体内容的执行
        注意，是基于条件控制的，break语句只能在循环和switch中进行使用
         */

        for (int i=20;i<=80;i++)
        {
            if(i==60)
            {
                break;
            }
            System.out.println(i+"岁，正在上班~~~~");
        }
        /*
        countine 用在循环中，基于条件控制，跳过某次循环的执行，继续下一次的执行。
        break 用在循环中，基于条件控制，终止循环体内容的执行，也就是说结束当前的整个循环。
         */

    }
}
