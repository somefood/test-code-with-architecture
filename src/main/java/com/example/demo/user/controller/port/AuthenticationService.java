package com.example.demo.user.controller.port;

public interface AuthenticationService {

    void verifyEmail(long id, String certificationCode);

    void login(long id);
}
