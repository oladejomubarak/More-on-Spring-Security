package com.security.springsecurityproject.data.model;

import lombok.Data;

import java.util.Set;

@Data
public class User {
    private String username;
    private String email;
    private String password;
    private Set<Roles> role;
}
