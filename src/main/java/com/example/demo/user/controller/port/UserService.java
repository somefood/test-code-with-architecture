package com.example.demo.user.controller.port;

import com.example.demo.user.domain.User;
import com.example.demo.user.domain.UserCreate;
import com.example.demo.user.domain.UserUpdate;

public interface UserService {

    User create(UserCreate userCreate);

    User update(long id, UserUpdate userUpdate);

    void verifyEmail(long id, String certificationCode);

    void login(long id);

    User getById(long id);

    User getByEmail(String email);
}
