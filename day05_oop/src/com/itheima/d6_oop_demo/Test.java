package com.itheima.d6_oop_demo;

import java.util.Scanner;

public class Test {
    /*
    * 展示系统中的全部电影信息(每部电影展示：名称、价格)。
    * 允许用户根据电影编号（id）查询出某个电影的详细信息。
    * detailed
    * */
   /* 1, "《扫黑行动》", 38.9, 9.7,  "林德禄",  "周一国", "12万人想看"
      2, "《万里归途》", 59.9, 9.6,  "饶晓志",  "张译", "13.5万人想看"
      3, "《哥，你好》", 35.8, 9.5,  "张栾",  "马丽", "17.9万人想看"
      4, "《名侦探柯南》", 69.5, 9.1,  "满仲劝",  "高山南", "17.9万人想看"*/
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Movie m1 = new Movie(1, "《扫黑行动》", 38.9, 9.7,  "林德禄",  "周一国", "12万人想看");
        Movie m2 = new Movie(2, "《万里归途》", 59.9, 9.6,  "饶晓志",  "张译", "13.5万人想看");
        Movie m3 = new Movie(3, "《哥，你好》", 35.8, 9.5,  "张栾",  "马丽", "17.9万人想看");
        Movie m4 = new Movie(4, "《名侦探柯南》", 69.5, 9.1,  "满仲劝",  "高山南", "17.9万人想看");
        Movie [] movies ={m1,m2,m3,m4};
        show(movies);
        System.out.println("请输入你想要了解的电影ID：");
        long id = sc.nextLong();
        Movie movie = getDetailedById(id, movies);
        if(movie==null){
            System.out.println("你输入的ID未查询到数据。");
        }else {
            System.out.println(getDetailedById(id,movies));
        }
    }
    public static void show(Movie [] movies){
        for (Movie movie : movies) {
            System.out.println("电影名："+movie.getName());
            System.out.println("价格："+movie.getPrice()+"元");
            System.out.println("---------------------------");
        }
    }
    public static Movie getDetailedById(Long id,Movie [] movies){
        for (Movie movie : movies) {
            if(id==movie.getId()){
                return movie;
            }
        }
        return null;
    }
}
