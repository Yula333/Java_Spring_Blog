package com.itproger.repo;

import com.itproger.models.User;
import org.springframework.data.jpa.repository.JpaRepository;           //в этом классе функции более подходят для регистрации и авторизации

public interface UserRepository extends JpaRepository <User, Long>{
    User findByUsername(String username);
}
