package com.test;

import com.domain.Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneManger {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        ArrayList<Phone> list = new ArrayList<>();

        System.out.println("--欢迎使用手机仓库管理系统--");
        System.out.println("1 添加手机信息");
        System.out.println("2 删除手机信息");
        System.out.println("3 修改手机信息");
        System.out.println("4 查找手机信息");
        System.out.println("5 退出手机仓库管理系统");

        lo:while (true){

            System.out.println("[请输入数字访问功能模块]");

            String choice = sc.next();

            switch (choice){
                case "1":
                    System.out.println("添加手机信息");
                    addPhone(list);
                    break;
                case "2":
                    System.out.println("删除手机信息");
                    deletePhone(list);
                    break;
                case "3":
                    System.out.println("修改手机信息");
                    updatePhone(list);
                    break;
                case "4":
                    System.out.println("查找手机信息");
                    queryPhone(list);
                    break;
                case "5":
                    System.out.println("退出手机仓库管理系统");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }

    }

    public static void queryPhone(ArrayList<Phone> list) {
        if (list.size() == 0) {
            System.out.println("系统中无信息，请添加后再进行查看");
            return;
        }
        System.out.println("手机货物编号  手机名称  手机品牌  手机价格  手机数量");
        for (int i = 0; i < list.size(); i++) {
            Phone Ph = list.get(i);
            System.out.println(Ph.getPhoneCode()+"    "+Ph.getPhName()+"    "+Ph.getPhBrand()+"    "+Ph.getPhPrice()+"    "+Ph.getPhNumber());
        }
    }

    public static void updatePhone(ArrayList<Phone> list) {
        System.out.println("请输入您要修改的手机货物编号：");

        Scanner sc = new Scanner(System.in);

        String updatePhCode = sc.next();

        int index = getIndex(list, updatePhCode);

        if (index == -1) {
            System.out.println("[输入有误，请查证后再次输入]");
            return;
        }
        else {
            System.out.println("请输入手机名称：");
            String PhoneName = sc.next();

            System.out.println("请输入手机品牌：");
            String PhoneBrand = sc.next();

            System.out.println("请输入手机价格：");
            int PhonePrice = sc.nextInt();

            System.out.println("请输入手机数量：");
            int PhoneNumber = sc.nextInt();

            Phone Ph = new Phone(updatePhCode,PhoneName,PhoneBrand,PhonePrice,PhoneNumber);

            list.set(index,Ph);

            System.out.println("修改成功");
        }

    }

    public static void deletePhone(ArrayList<Phone> list) {
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("[系统载入成功]");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("[请输入您要删除的手机货物编号]：");
        Scanner sc = new Scanner(System.in);
        String deletePhCode = sc.next();

        int index = getIndex(list, deletePhCode);
        if (index == -1) {
            System.out.println("[输入有误，请查证后再次输入]！");
            return;
        }
        else {
            list.remove(index);
            System.out.println("删除成功！");
        }
    }

    public static void addPhone(ArrayList<Phone> list) {
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("[系统载入成功]");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        Scanner sc = new Scanner(System.in);

        String PhoneCode;

        while (true){

            System.out.println("请输入手机货物编号：");

            PhoneCode = sc.next();

            int index = getIndex(list, PhoneCode);

            if (index == -1) {

                break;

            }
        }


        System.out.println("请输入手机名称：");

        String PhoneName = sc.next();

        System.out.println("请输入手机品牌：");

        String PhoneBrand = sc.next();

        System.out.println("请输入手机价格：");

        int PhonePrice = sc.nextInt();

        System.out.println("请输入手机数量：");

        int PhoneNumber = sc.nextInt();

        Phone Ph = new Phone(PhoneCode,PhoneName,PhoneBrand,PhonePrice,PhoneNumber);

        list.add(Ph);

        System.out.println("添加成功");
    }
    public static int getIndex(ArrayList<Phone> list,String PhCode){
        int index =-1;
        for (int i = 0; i < list.size(); i++) {

            Phone Ph = list.get(i);
            String code =Ph.getPhoneCode();
            if (code.equals(PhCode)) {
                index = i;
            }
        }
        return index;
    }
}
