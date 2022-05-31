package com.ggyy.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseEnum {
    USERNAME_NULL(300,"用户不存在！"),
    PASSWORD_ERROR(301,"密码错误！"),
    LOGIN_ERROR(302,"登录信息失效！");

    private Integer code;
    private String msg;
}
