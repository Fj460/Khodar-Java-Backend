package com.khodar.springboot.Khodar.Java.exceptions;

public class EntityNotFoundException extends BadRequestException {
    public EntityNotFoundException(String message){
        super(message);
    }   
}
