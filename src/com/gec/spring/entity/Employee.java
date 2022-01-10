package com.gec.spring.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private String name_e;
    private Dept dept;
}
