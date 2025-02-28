package com.itheima.d3_for;

public class Test02 {
    public static void main(String[] args) {
        int sum =0;
        /*for (int i =0;i<=100;i++){
            if(i%2!=0){
                sum+=i;
            }
        }*/
        for (int i=1;i<=100;i+=2){
            sum+=i;
        }
        System.out.println(sum);
    }
}
