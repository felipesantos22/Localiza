package com.movidas.movidas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private DataBase dataBase;

    @GetMapping
    public List<Car> findAllCAr() {
        return dataBase.findAll();
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return dataBase.save(car);
    }


}
