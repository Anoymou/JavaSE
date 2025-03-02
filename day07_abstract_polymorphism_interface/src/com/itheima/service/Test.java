package com.itheima.service;

import com.itheima.service.impl.StudentServiceImplA;
import com.itheima.service.impl.StudentServiceImplB;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三","男",89);
        Student stu2 = new Student("李四","女",90);
        Student stu3 = new Student("王五","男",78);
        Student stu4 = new Student("赵六","女",56);
        Student stu5 = new Student("老八","男",50);

        Student [] students = {stu1,stu2,stu3,stu4,stu5};

        StudentService studentService = new StudentServiceImplB();
        studentService.toPrintInfo(students);
        studentService.toPrintAverageScore(students);
    }
}
