package com.itheima.d9_lambda_demo;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 21, 170.7);
        Student stu2 = new Student("李四", 22, 178.0);
        Student stu3 = new Student("王五", 27, 160.65);
        Student stu4 = new Student("赵六", 18, 150.5);
        Student stu5 = new Student("王二麻子", 24, 180.9);

        Student [] students ={stu1,stu2,stu3,stu4,stu5};

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                return stu2.getAge() -stu1.getAge();//根据年龄倒序排
            }
        });




        System.out.println(Arrays.toString(students));

        Arrays.sort(students,(Student s1, Student s2)-> {
            return Double.compare(s1.getHeight(),s2.getHeight());//根据身高正序排
        });

        System.out.println("===================================");

        Arrays.sort(students,( s1, s2)-> Double.compare(s1.getHeight(),s2.getHeight()));


        System.out.println(Arrays.toString(students));
    }
}
