package com.itheima.homework.d1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
abstract class Employee {
    private String id;
    private String name;
    private double salary;

    public abstract void work();
    public abstract void eat();
}
