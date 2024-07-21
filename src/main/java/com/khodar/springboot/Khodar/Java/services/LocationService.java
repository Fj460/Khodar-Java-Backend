package com.khodar.springboot.Khodar.Java.services;

import com.khodar.springboot.Khodar.Java.exceptions.EntityNotFoundException;
import com.khodar.springboot.Khodar.Java.models.City;
import com.khodar.springboot.Khodar.Java.models.Province;
import com.khodar.springboot.Khodar.Java.repositories.CityRepository;
import com.khodar.springboot.Khodar.Java.repositories.ProvinceRepository;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private ProvinceRepository provinceRepository;
    @Autowired
    private CityRepository cityRepository;

    public List<Province> getAllPRovinces(){
        return provinceRepository.findAll();
    }
    public List<City> getAllCities(){
        return cityRepository.findAll();
    }
    public List<City> getAllCitiesProvinceId(Long provinceId){
        return cityRepository.findAllByProvinceId(provinceId);
    }
    public Province getProvinceById(Long provinceId){
        return provinceRepository.findById(provinceId).orElseThrow();
    }
    public City getCityById(Long cityId){
        return cityRepository.findById(cityId).orElseThrow();
    }
}
