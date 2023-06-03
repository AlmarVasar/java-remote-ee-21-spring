package com.sda.javaremoteee21spring.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.YearMonth;

@Entity
@Table(name = "Cars")
@Data
@AllArgsConstructor
@Builder //builder dont need no arg constructor
@NoArgsConstructor

public class Car {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String brand;

    String model;

    String vin;

    @Enumerated(EnumType.STRING)
    Colour colour;

    YearMonth productionYearMonth;

    int mileage;

    @Enumerated(EnumType.STRING)
    Fuel fuelType;

    boolean insurance;


}
