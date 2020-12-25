package com.southwind.entity;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;
    private Classes classes;
}
