package com.itheima.d5_javabean;

public class Test {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("张三");
        user1.setAge(20);
        user1.setSalary(10000);
        user1.setHavaHouse(true);

        User user2 = new User("李四", 170, 120, 21, false, 3000);
        System.out.println("会员："+user1.getName()+"是否有房："+user1.isHavaHouse());
        System.out.println("会员："+user2.getName()+"是否有房："+user2.isHavaHouse());
    }
}
