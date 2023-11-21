package com.example.crudproject.domain.user.entity.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class UserLoginDto {

    @NotNull(message = "아이디는 최소 한 글자에서 최대 40자 이하여야 합니다.")
    @Size(min = 1, max = 40)
    private String loginId;

    @NotNull(message = "패스워드는 최소 한 글자 이상이어야 합니다.")
    @Size(min = 1)
    private String password;

}
