package com.spring.myapp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class SensorDTO {
    @NotEmpty(message = "The name should not be blank!")
    @Size(min = 3, max = 30, message = "The name of the sensor must be between 3 and 30 characters!")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}