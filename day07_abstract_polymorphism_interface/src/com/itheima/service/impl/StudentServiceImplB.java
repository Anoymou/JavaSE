package com.itheima.service.impl;

import com.itheima.service.Student;
import com.itheima.service.StudentService;

public class StudentServiceImplB implements StudentService {
    @Override
    public void toPrintInfo(Student[] students) {
        int boy =0;
        int girl =0;
        System.out.println("班级所有学生的信息如下：");
        for (Student student : students) {
            System.out.println("姓名："+student.getName());
            System.out.println("性别："+student.getGender());
            System.out.println("成绩："+student.getScore());
            System.out.println("*****************************");
            if(student.getGender() == "男"){
                boy++;
            }else {
                girl++;
            }
        }
        System.out.println("班级男生人数为："+boy+"，班级女生人数为："+girl);
    }

    @Override
    public void toPrintAverageScore(Student[] students) {
        double max = students[0].getScore();
        double min = students[0].getScore();
        double sum =0;
        for (Student student : students) {
            sum+=student.getScore();
            if(student.getScore()>max){
                max =student.getScore();
            }
            if(student.getScore()<min){
                min = student.getScore();
            }
        }
        System.out.println("平均成绩为："+(sum-max-min)/(students.length-2));
    }
}
