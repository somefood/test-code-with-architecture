package com.example.demo.user.controller.response;

import com.example.demo.user.domain.MyProfileResponse;
import com.example.demo.user.domain.User;
import com.example.demo.user.domain.UserStatus;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyProfileResponseTest {
    
    @Test
    void User으로_응답을_생성할_수_있다() {
        // given
        User user = User.builder()
                .id(1L)
                .email("test@naver.com")
                .nickname("test")
                .address("Seoul")
                .status(UserStatus.ACTIVE)
                .lastLoginAt(100L)
                .certificationCode("aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa")
                .build();
        
        // when
        MyProfileResponse myProfileResponse = MyProfileResponse.from(user);
        
        // then
        assertThat(myProfileResponse.getId()).isEqualTo(1);
        assertThat(myProfileResponse.getEmail()).isEqualTo("test@naver.com");
        assertThat(myProfileResponse.getNickname()).isEqualTo("test");
        assertThat(myProfileResponse.getStatus()).isEqualTo(UserStatus.ACTIVE);
        assertThat(myProfileResponse.getLastLoginAt()).isEqualTo(100L);
    }
}
