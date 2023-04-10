package com.RedisEs.Migrate.service;

import com.RedisEs.Migrate.models.User;
import com.RedisEs.Migrate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public boolean saveUser(User user) {
        return userRepository.saveUser(user);
    }

    @Override
    public List<User> fetchAllUser() {
        return userRepository.fetchAllUser();
    }
}
