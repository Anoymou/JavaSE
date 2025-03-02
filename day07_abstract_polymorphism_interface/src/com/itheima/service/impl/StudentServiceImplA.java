package com.itheima.service.impl;

import com.itheima.service.Student;
import com.itheima.service.StudentService;

public class StudentServiceImplA implements StudentService {
    @Override
    public void toPrintInfo(Student[] students) {
        System.out.println("班级所有学生的信息如下：");
        for (Student student : students) {
            System.out.println("姓名："+student.getName());
            System.out.println("性别："+student.getGender());
            System.out.println("成绩："+student.getScore());
            System.out.println("*****************************");
        }
    }

    @Override
    public void toPrintAverageScore(Student[] students) {
        double sum =0;
        for (Student student : students) {
            sum+=student.getScore();
        }
        System.out.println("平均成绩为："+(sum/students.length));
    }
}
