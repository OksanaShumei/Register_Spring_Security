package com.account.service;

import com.account.model.User;

public interface UserService {
    public void save(User user);
    public User findByUsername(String username);
}
