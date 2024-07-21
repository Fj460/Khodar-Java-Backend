package com.khodar.springboot.Khodar.Java.repositories;

import com.khodar.springboot.Khodar.Java.models.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Long> {
}
