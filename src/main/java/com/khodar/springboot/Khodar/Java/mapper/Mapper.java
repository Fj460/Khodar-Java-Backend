package com.khodar.springboot.Khodar.Java.mapper;

import com.khodar.springboot.Khodar.Java.dtos.CityResponseDto;
import com.khodar.springboot.Khodar.Java.dtos.ProvinceResponseDto;
import com.khodar.springboot.Khodar.Java.models.City;
import com.khodar.springboot.Khodar.Java.models.Province;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Mapper {
    @Autowired
    private ModelMapper modelMapper;

    public ProvinceResponseDto mapProvinceToResponseDto(Province province){
        return modelMapper.map(province, ProvinceResponseDto.class);
    }
    public List<ProvinceResponseDto> mapProvinceToResponseDtoList(List<Province> provinces){
        return provinces.stream().map(province -> mapProvinceToResponseDto(province)).collect(Collectors.toList());
   //review
    }
    public CityResponseDto mapCityToResponseDto(City city){
        return modelMapper.map(city, CityResponseDto.class);
    }
    public List<CityResponseDto> mapCityToResponseDtoList(List<City> cities){
        return cities.stream().map(city-> mapCityToResponseDto(city)).collect(Collectors.toList());
    }
}
