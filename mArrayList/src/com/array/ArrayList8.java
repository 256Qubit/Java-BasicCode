package com.array;

import com.domain.Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList8 {
    public static void main(String[] args) {

        ArrayList<Phone> list = new ArrayList<>();
        Phone phone1 = getPhone();
        Phone phone2 = getPhone();
        Phone phone3 = getPhone();
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            System.out.println(phone.getPhone_name()+"  "+phone.getPhone_brand()+"  "+phone.getPhone_price()+"  "+phone.getPhone_stock());
        }
    }

    private static Phone getPhone() {
        Scanner sc = new Scanner(System.in);
        //键盘接收字符串可以用next() 或者nextLine() 方法
        //键盘接收整数使用nextInt()方法
        System.out.println("请输入手机名称:");
        String P_name =sc.next();
        System.out.println("请输入手机品牌:");
        String P_brand =sc.next();
        System.out.println("请输入手机价格:");
        int P_prince= sc.nextInt();
        System.out.println("请输入库存存量:");
        int P_stock = sc.nextInt();
        Phone phone = new Phone(P_name,P_brand,P_prince,P_stock);

        return phone;
    }
}
