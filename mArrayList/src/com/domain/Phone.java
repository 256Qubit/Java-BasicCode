package com.domain;

public class Phone {

    private String Phone_name;
    private String Phone_brand;
    private int Phone_price;
    private int Phone_stock;

    public Phone() {
    }

    public Phone(String phone_name, String phone_brand, int phone_price, int phone_stock) {
        Phone_name = phone_name;
        Phone_brand = phone_brand;
        Phone_price = phone_price;
        Phone_stock = phone_stock;
    }

    public String getPhone_name() {
        return Phone_name;
    }

    public void setPhone_name(String phone_name) {
        Phone_name = phone_name;
    }

    public String getPhone_brand() {
        return Phone_brand;
    }

    public void setPhone_brand(String phone_brand) {
        Phone_brand = phone_brand;
    }

    public int getPhone_price() {
        return Phone_price;
    }

    public void setPhone_price(int phone_price) {
        Phone_price = phone_price;
    }

    public int getPhone_stock() {
        return Phone_stock;
    }

    public void setPhone_stock(int phone_stock) {
        Phone_stock = phone_stock;
    }
}
