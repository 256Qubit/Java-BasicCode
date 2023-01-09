public class contrast {
    public static void main(String[] args) {
        /*
        语法 :for
        (条件初始化;条件判断;条件变化)
        {
        循环体;
        }
        条件初始化;
        while(条件判断){
        循环体;
        条件变化;
        }
        while
 条件初始化;
 while(条件判断){
 	循环体语句;
 	条件变化;
 }
 do..while
 条件初始化;
 do{
 	循环体语句;
 	条件变化;
 }while(条件判断);
  while : 先判断,满足条件要求再执行每一次循环。
 do..while : 先执行一次,然后判断条件决定下一次知否执行
 	无论是否满足条件,都至少执行一次。

 for : 次数循环 -> 多 ****
 while : 条件循环 -> **
 do..while : 理解
编译器识别的死循环:
		while(true){}
		for(;;){}
		do{}while(true);
		死循环后面的代码为不可达语句
运行时期的死循环 :
		后面出现了语句,编译也不会报错,因为编译器认为这个循环有可能停止。
ctrl+c ==> 控制台中强制终止程序的执行。
for(条件初始化;条件判断;条件变化){
  //循环体语句
 for(条件初始化;条件判断;条件变化){
	循环体语句
 }
  //循环体语句
 }
 外层循环执行一次,内存循环执行一轮(从开始到不满足循环条件结束)
         */

        for (int i =1;i<=5;i++)
        {
            System.out.println(i);
            //for循环内部【定义】的变量，在循环结束后就会从内存中消失。
        }
        //System.out.println(i); 错误找不到符号
        System.out.println("-------------");
        /*for (i =0;i<=10;i++)
        {
            System.out.println(i);
        }*/

        System.out.println("-------------");
        int a =1;
        while (a<=5){
            System.out.println(a);
            a++;
        }
        System.out.println(a+"-----");
        /*
        for和whlie循环选判断条件是否成立，然后在决定是否执行循环体。（先判断后执行）
        do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体（先执行后判断）

        for和while的区别：
        条件控制语句的自增变量，因为归属for循环的语法结构之中，在for循环结束后就无法再次被访问到了。
        条件控制语句的自增变量，对于while循环来说不归属于其语法结构之中，在while循环结束后，该变量依旧可以被使用

        运用场景：
        明确循环次数用for循环，不明确循环次数使用whlie循环。
        do....while循环很少使用
         */
        System.out.println("---------");
        int count =0;
        double paper = 0.1;
        int zf= 8844430;
        while (paper<=zf){
            paper *=2;
            System.out.println(paper);
            count++;
        }
        System.out.println(count);

        System.out.println("--------");
        int c=0;
        do{
            System.out.println("i");
            c++;
        }while(c<=9);
    }
}
