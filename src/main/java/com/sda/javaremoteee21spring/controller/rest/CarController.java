package com.sda.javaremoteee21spring.controller.rest;

import com.sda.javaremoteee21spring.entity.Car;
import com.sda.javaremoteee21spring.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public List<Car> getAllCars() {
        log.info("getting all car");
        return carService.findAllCars();
    }



        @GetMapping("/cars/{id}")
        public Car getCarById(@PathVariable Long id) {
        log.info("Getting car by id :[{}],",id);
            return carService.findCarById(id);
    }

    @PostMapping("/cars")
    public ResponseEntity<Car> createCar(@RequestBody Car carToSave, UriComponentsBuilder ucb) {
        log.info("create new car: [{}]", carToSave);
        Car saved = carService.saveCar(carToSave);
        URI path = ucb.path("/api/cars/{id}")
                .buildAndExpand(saved.getId())
                .toUri();
        return ResponseEntity.created(path)
                .body(saved);
    }


    @DeleteMapping("/cars/{id}")
    public ResponseEntity<Void> deleteCarById(@PathVariable Long id) {
        log.info("Deleting car by id : [{}]", id);
        carService.deleteCarById(id);
        return ResponseEntity.noContent()
                .build();
    }

    @PutMapping("/cars/{id}")
    public Car repleaceCar(@RequestBody Car carToReplace, @PathVariable("id") Long carId){
        log.info("Replacing car with id: [{}] with content:[{}]",carId, carToReplace);
        carService.replaceCarById(carToReplace, carId);
        return carToReplace;
    }
    @PatchMapping("/cars/{id}")
    public Car updateCar(@PathVariable("id") Long id, @RequestBody Car carToUpdate) {
        log.info("Updating car with id: [{}]", id, carToUpdate);

        return carService.updateCar(id, carToUpdate);
    }
}
