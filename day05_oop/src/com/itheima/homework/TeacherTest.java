package com.itheima.homework;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher tea1 = new Teacher();
        Teacher tea2 = new Teacher("李老师","t002");
        tea1.setName("杨老师");
        tea1.setId("t001");
        tea1.teach();
        tea2.teach();
    }
}
