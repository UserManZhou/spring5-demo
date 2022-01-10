package com.gec.spring.entity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
//@AllArgsConstructor
@ToString
public class User {

    private String username;
    private String password;

    public void add(){
        System.out.println("添加中");
    }
}
