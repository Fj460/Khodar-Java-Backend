package com.khodar.springboot.Khodar.Java.controllers;

import com.khodar.springboot.Khodar.Java.dtos.CityResponseDto;
import com.khodar.springboot.Khodar.Java.dtos.ProvinceResponseDto;
import com.khodar.springboot.Khodar.Java.mapper.Mapper;
import com.khodar.springboot.Khodar.Java.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/v1/locations")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @Autowired
    private Mapper mapper;

    @GetMapping("/provinces")
    public ResponseEntity<List<ProvinceResponseDto>> getAllProvinces(){
        return ResponseEntity.ok(mapper.mapProvinceToResponseDtoList(
                locationService.getAllPRovinces()
        ));
    }
    @GetMapping("province")
    public ResponseEntity<ProvinceResponseDto> getProvinceById(@RequestParam Long id){
        return ResponseEntity.ok(mapper.mapProvinceToResponseDto(
                locationService.getProvinceById(id)
        ));
    }
    @GetMapping("/cities")
    public ResponseEntity<List<CityResponseDto>> getAllCities(){
        return ResponseEntity.ok(mapper.mapCityToResponseDtoList(
                locationService.getAllCities()
        ));
    }
    @GetMapping("/cities/{provinceId}")
    //previously getCityById
    public ResponseEntity<List<CityResponseDto>> getCityByProvinceId(@PathVariable Long provinceId){
        return ResponseEntity.ok(mapper.mapCityToResponseDtoList(
                locationService.getAllCitiesProvinceId(provinceId)
        ));
    }
    @GetMapping("/city")
    //getCityByProvinceId
    public ResponseEntity<CityResponseDto> getCityById(@RequestParam Long id){
        return ResponseEntity.ok(mapper.mapCityToResponseDto(
                locationService.getCityById(id)
        ));
    }
}
