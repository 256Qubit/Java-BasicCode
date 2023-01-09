public class Democontinue {
    public static void main(String[] args) {
        /*
        break :
	作用 :  终止,结束。
	应用场景 : switch,循环。
continue:
	作用 :  结束本次循环,直接进入到下一次循环。
	应用场景 : 循环中。
	如果想要break与continue针对多重循环嵌套下的某一层循环,可以使用带标签的break与continue。
 步骤:
 	1.每一层设置标签。
 	2.使用break与continue的时候==> break|continue 标签名。
         */

        for(int i=0;i<=24;i++){
            if (i==4)
            {
                continue;
            }
            System.out.println(i+"层到了....");
        }

        System.out.println("------------------------------------" );

        int a=1;
        while(a<=24)
        {

            System.out.println(a+"层到了.....");
            a++;
        }
        System.out.println("------------------------------------");


    }
}
