package com.khodar.springboot.Khodar.Java.repositories;

import com.khodar.springboot.Khodar.Java.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
