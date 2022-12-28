package com.example.loginapp.service;

import com.example.loginapp.model.User;
import com.example.loginapp.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
