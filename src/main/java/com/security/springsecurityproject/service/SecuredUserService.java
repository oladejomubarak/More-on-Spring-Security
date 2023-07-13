package com.security.springsecurityproject.service;

import com.security.springsecurityproject.data.model.SecuredUser;
import com.security.springsecurityproject.data.model.User;
import com.security.springsecurityproject.data.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecuredUserService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User foundUser = userRepo.findUserByEmailIgnoreCase(username).orElse(null);

        return new SecuredUser(foundUser);
    }
}
