package com.itheima.d2_code_block;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;

    {
        name = "ikun";
        age = 18;
    }

}
