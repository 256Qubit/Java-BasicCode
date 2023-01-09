package com.domain;

public class Phone {
    private  String PhoneCode;
    private String PhName;
    private  String PhBrand;
    private  int PhPrice;
    private  int PhNumber;

    public Phone() {
    }

    public Phone(String phoneCode, String phName, String phBrand, int phPrice, int phNumber) {
        PhoneCode = phoneCode;
        PhName = phName;
        PhBrand = phBrand;
        PhPrice = phPrice;
        PhNumber = phNumber;
    }

    public String getPhoneCode() {
        return PhoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        PhoneCode = phoneCode;
    }

    public String getPhName() {
        return PhName;
    }

    public void setPhName(String phName) {
        PhName = phName;
    }

    public String getPhBrand() {
        return PhBrand;
    }

    public void setPhBrand(String phBrand) {
        PhBrand = phBrand;
    }

    public int getPhPrice() {
        return PhPrice;
    }

    public void setPhPrice(int phPrice) {
        PhPrice = phPrice;
    }

    public int getPhNumber() {
        return PhNumber;
    }

    public void setPhNumber(int phNumber) {
        PhNumber = phNumber;
    }
}
