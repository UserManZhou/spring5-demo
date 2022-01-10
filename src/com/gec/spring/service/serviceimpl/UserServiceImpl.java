package com.gec.spring.service.serviceimpl;

import com.gec.spring.entity.User;
import com.gec.spring.service.UserService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserServiceImpl implements UserService {

    private User user;

    @Override
    public void add() {
        System.out.println("add-UserService");
        user.add();
    }
}
