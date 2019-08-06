package com.whhp.springboot080101.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Emp {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Date birthday;
}
