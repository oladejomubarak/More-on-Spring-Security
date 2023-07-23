package com.security.springsecurityproject.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document
public class User {
    private String id;
    private String username;
    private String email;
    private String password;
    private Set<Roles> role;
}
