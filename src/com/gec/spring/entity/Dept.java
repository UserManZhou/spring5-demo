package com.gec.spring.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dept {

    private String name_dept;
    private List<Employee> employees;

}
