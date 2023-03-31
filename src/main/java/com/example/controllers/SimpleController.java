package com.example.controllers;

import com.example.repository.entity.Car;
import com.example.repository.entity.Number;
import com.example.service.SimpleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@Slf4j
public class SimpleController {

    SimpleService simpleService;

    @Autowired
    SimpleController(SimpleService simpleService)
    {
        this.simpleService = simpleService;
    }

    @GetMapping("command")
    public String command(@RequestParam String name, @RequestParam String value){
        Car car = new Car(name);
        Number number = new Number(value);
        car.setNumber(number);
        number.setCar(car);
        return "Completed";
    }

    @GetMapping("addCar")
    public Car addCar(@RequestParam String name)
    {
        return simpleService.addCar(name);
    }

    @GetMapping("deleteCar")
    public void deleteCar(@RequestParam Long id)
    {
        simpleService.deleteCar(id);
    }

    @GetMapping("editNameCar")
    public int editNameCar(@RequestParam Long id, @RequestParam String name)
    {
        return simpleService.editNameCar(id, name);
    }
    @GetMapping("allCar")
    public List<Car> allCar()
    {
        return simpleService.allCar();
    }


}
