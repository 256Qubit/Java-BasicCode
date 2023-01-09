package com.itheima.demo1;

import util.java.Scanner;

public class anli
{
public static void main(String[] args)
{

lo:while(true)
{
Scanner sc = new Scanner(System.in);
System.out.ptintln("请输入您所要查看的星期数：");
System.out.ptintln("如无需查看，请按0退出本程序。");
int week = sc.nextInt();
switch(week)
{
case 0:
System.out.ptintln("感谢您的使用！");
break lo;
case 1:
System.out.println("跑步");
break;
case 2:
System.out.println("慢走");
break;
case 3:
System.out.println("游泳");
break;

case 4:
System.out.println("动感单车");
break;

case 5:
System.out.println("拳击");
break;

case 6:
System.out.println("爬山");
break;

case 7:
System.out.println("好好吃一顿");
break;

default:
System.out.println("您的数据有误");
break;

}
}

}
}