package com.example.springpractice.dto;

import com.example.springpractice.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class MemberForm {
    private Long id;  // id 필드 추가
    private String email;  // 이메일을 받을 필드
    private String password;  // 비번을 받을 필드

    public Member toEntity(){
        return new Member(id, email, password);
    }

}
