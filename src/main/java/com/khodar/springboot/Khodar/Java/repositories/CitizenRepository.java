package com.khodar.springboot.Khodar.Java.repositories;

import com.khodar.springboot.Khodar.Java.models.Citizens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizens, Long> {
}
