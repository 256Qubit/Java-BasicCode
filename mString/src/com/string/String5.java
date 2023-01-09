package com.string;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入账号：");
            String scUsername = sc.nextLine();
            System.out.println("请输入密码：");
            String scPassword = sc.nextLine();

            if (username.equals(scUsername)&&password.equals(scPassword)) {
                System.out.println("登陆成功");
                break;
            }
            else if(username.equals(scUsername) && password.equals(scPassword)==false){
                System.out.println("");
                System.out.println("密码错误，请检验后再次输入");
                System.out.println("");
                if(i ==3){
                    System.out.println("错误次数过多，已自动锁定，请明天再试");
                }
                else {
                    System.out.println("[您还剩余" + (3 - i) + "次机会]");
                    System.out.println("");
                }

            } else if (username.equals(scUsername)==false &&password.equals(password)) {
                System.out.println("");
                System.out.println("账号错误，请检验后再次输入");
                System.out.println("");
                if(i==3){
                    System.out.println("错误次数过多，已自动锁定，请明天再试");
                }else {
                    System.out.println("[您还剩余" + (3 - i) + "次机会]");
                    System.out.println("");
                }
            }
            else {
                System.out.println("");
                System.out.println("登录失败");
                System.out.println("");
                if (i==3){
                    System.out.println("错误次数过多，已自动锁定，请明天再试");
                }else {
                    System.out.println("[您还剩余" + (3 - i) + "次机会]");
                    System.out.println("");
                }
            }
        }

    }
}
