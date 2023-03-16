package com.array;

import com.domain.Phone;

import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米11","xiaomi",3999,20);
        Phone p2 = new Phone("小米12","xiaomi",4999,11);
        Phone p3 = new Phone("iphone11","iphone",5999,15);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            System.out.println(phone.getPhone_name()+"/  "+phone.getPhone_brand()+"/  "+phone.getPhone_price()+"/  "+phone.getPhone_stock());
        }
    }
}
