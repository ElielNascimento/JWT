package com.bn.jwt2.users;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Annotation;

@RestController
@RequestMapping("/users")
public class UserController  implements  RestController{

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return RestController.super -> UserRole;
    }
}
