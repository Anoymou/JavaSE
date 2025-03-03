package com.itheima.homework.d1;

public class Test {
    public static void main(String[] args) {
        Month  month =Month.DECEMBER;
        getMonthDayNumber(month);
    }
    public static void getMonthDayNumber(Month month){
        switch (month.ordinal()+1){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month.getDesc()+"有31天");
                break;
            case 2:
                System.out.println(month.getDesc()+"有28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month.getDesc()+"有30天");
                break;
        }
    }
}