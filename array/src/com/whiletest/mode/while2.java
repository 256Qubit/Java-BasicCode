package com.whiletest.mode;

/*
		需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
		请问，我折叠多少次，可以折成珠穆朗玛峰的高度?

		步骤:
			1. 定义计数器变量, 准备用于统计折叠的次数
			2. 准备纸张厚度变量, 珠峰高度变量
			3. 折叠的过程是多次, 所以使用循环, 不确定循环次数, 使用while循环
				进入循环的条件为(厚度没有超过珠峰的高度就折叠)
			4. 每折叠一次, 计数器就要自增(查数)
			5. 循环结束后, 打印计数器变量即可.

	*/

public class while2 {
    public static void main(String[] args) {

        int count = 0;

        double  paper = 0.1;

        int zf  = 8844430;

        while (paper<zf)
        {
            paper *= 2;
            count++;
            System.out.println("第"+count+"次折叠后纸张厚度为："+paper);
        }

        System.out.println("因此折叠【"+count+"】次后，一张纸的高度将会超过珠穆朗玛峰");

    }
}
