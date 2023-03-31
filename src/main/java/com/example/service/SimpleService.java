package com.example.service;

import com.example.repository.CarRepository;
import com.example.repository.ClassCarRepository;
import com.example.repository.NumberRepository;
import com.example.repository.OwnerRepository;
import com.example.repository.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleService {

    CarRepository carRepository;
    ClassCarRepository classCarRepository;
    NumberRepository numberRepository;
    OwnerRepository ownerRepository;

    @Autowired
    public SimpleService(CarRepository carRepository, ClassCarRepository classCarRepository, NumberRepository numberRepository, OwnerRepository ownerRepository) {
        this.carRepository = carRepository;
        this.classCarRepository = classCarRepository;
        this.numberRepository = numberRepository;
        this.ownerRepository = ownerRepository;
    }

    public Car addCar(String name)
    {
        return carRepository.save(new Car(name));
    }

    public int editNameCar(Long id, String name)
    {
        return carRepository.updateNameById(name, id);
    }

    public void deleteCar(Long id)
    {
        carRepository.deleteById(id);
    }

    public List<Car> allCar(){
        return carRepository.findAll();
    }

}
