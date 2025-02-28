package com.itheima.d5_javabean;

public class User {
    private String name;
    private double height;
    private double weight;
    private int age;
    private boolean havaHouse;
    private double salary;

    public User(){}

    public User(String name, double height, double weight, int age, boolean havaHouse, double salary) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.havaHouse = havaHouse;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHavaHouse() {
        return havaHouse;
    }

    public void setHavaHouse(boolean havaHouse) {
        this.havaHouse = havaHouse;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
