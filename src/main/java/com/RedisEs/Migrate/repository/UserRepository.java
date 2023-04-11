package com.RedisEs.Migrate.repository;

import com.RedisEs.Migrate.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);
}
