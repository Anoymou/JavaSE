package com.itheima.d1_enum;

import lombok.Data;

public enum Season {
    SPRING("春天"), SUMMER, AUTUMN("秋天"), WINTER;
    
    private String desc;
    Season(){}
    
    Season(String desc){
        this.desc=desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
