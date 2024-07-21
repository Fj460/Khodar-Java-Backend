package com.khodar.springboot.Khodar.Java.repositories;

import com.khodar.springboot.Khodar.Java.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    public List<City> findAllByProvinceId(Long provinceId);
}
