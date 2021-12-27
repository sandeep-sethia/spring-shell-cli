package com.example.springcliexample.service;

import com.example.springcliexample.model.CliUser;

public interface UserService {
    boolean exists(String username);
    CliUser create(CliUser user);
    CliUser update(CliUser user);
}
