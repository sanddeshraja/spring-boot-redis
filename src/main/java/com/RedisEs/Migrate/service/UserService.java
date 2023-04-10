package com.RedisEs.Migrate.service;

import com.RedisEs.Migrate.models.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();
}
