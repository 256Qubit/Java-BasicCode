public class dowhile1 {
    /*
    基本格式：
    do
    {
    循环语句;
    }while(条件判断语句);

    完整格式：
    初始化语句；
    do
    {
    循环体语句;
    条件控制语句;
    }while(条件判断语句);

     无论是否满足条件，do....while都会执行一次，因为do....while循环是从上到下依次执行。
     */
    public static void main(String[] args) {
        int i = 1;
        do
{
    System.out.println("傻逼程序员");
    i++;
}while(i<=10);
    }
}
