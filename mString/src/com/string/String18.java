package com.string;

import com.domain.Student;

import java.util.Scanner;

public class String18 {
    public static void main(String[] args) {

        System.out.println("【欢迎使用学生信息管理系统】");
        
        login();

        String[] stuInfo = EnInfo();

        String stuMoNu = EnMoNu();

        String remark = Remark();

        System.out.println("学生姓名为："+stuInfo[0]);

        System.out.println("学生年龄为："+stuInfo[1]);

        System.out.println("学生手机号为："+stuMoNu);

        System.out.println("学生备注信息为："+remark);


    }

    private static void character() {
        int DataType1 = 0;
        int DataType2 = 0;
        int DataType3 = 0;
        Scanner sc =  new Scanner(System.in);

        System.out.println("请输入：");

        String s = sc.nextLine();

        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char c= chars[i];
            if (c>='A'&&c<='Z'){
                DataType1++;
            } else if (c>='a'&&c<='z') {
                DataType2++;
            } else if (c>='0'&&c<='9') {
                DataType3++;
            }
        }
        System.out.println("输入的字符中[大写字母]字符个数为："+DataType1);
        System.out.println("输入的字符中[小写字母]字符个数为："+DataType2);
        System.out.println("输入的字符中[数字]字符个数为："+DataType3);
    }

    private static String Remark() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生备注信息：");

        String remark = sc.nextLine();

        String update = remark.replace("TMD", "***");

        return update;
    }

    private static String EnMoNu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入手机号：");

        String MoNu = sc.nextLine();

        String start = MoNu.substring(0, 3);

        String end = MoNu.substring(7);

        String MoNuuP = start+"****"+end;

        return MoNuuP;
    }

    private static String[] EnInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生信息：");

        String stuInfo = sc.nextLine();

        String[] split = stuInfo.split("，");

        Student stu = new Student(split[0],split[1]);

        String[] updated =new String[]{split[0],split[1]};

        return updated;

    }

    private static void login() {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "123456";


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
