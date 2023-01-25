package web.service;

import web.car.Car;

import java.util.List;

public interface CarServiceImpl {
    public List<Car> getCars();
    public List<Car> getCountCars(Integer count);
}
