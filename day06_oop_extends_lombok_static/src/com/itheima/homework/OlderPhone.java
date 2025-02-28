package com.itheima.homework;

public class OlderPhone {
    private String brand;
    private double price;

    public OlderPhone() {
    }

    public OlderPhone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call(String name){
        System.out.println("打电话给"+name);
    }

    public void sendMessage(String name){
        System.out.println("发短信给"+name);
    }

    public void show(){
        System.out.println("来电号码为xxxxxxxxxxx!");
    }
}
