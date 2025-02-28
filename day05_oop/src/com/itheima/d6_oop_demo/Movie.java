package com.itheima.d6_oop_demo;

public class Movie {
    private long id;
    private String name;
    private double price;
    private double score;
    private String director;
    private String actor;
    private String desc;

    public Movie() {
    }

    public Movie(long id, String name, double price, double score, String director, String actor, String desc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.director = director;
        this.actor = actor;
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return
                "电影名称：" + name + '\n' +
                "价格：" + price +'\n'+
                "评分：" + score +'\n'+
                "导演：" + director + '\n' +
                "主演：" + actor + '\n' +
                "描述：" + desc;
    }
}
