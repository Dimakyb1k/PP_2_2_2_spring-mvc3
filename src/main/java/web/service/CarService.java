package web.service;

import org.springframework.stereotype.Component;
import web.car.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarService implements CarServiceImpl{

    public final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Lada", "Green", 1001));
        carList.add(new Car("VW", "Serebro", 150));
        carList.add(new Car("MB", "White", 249));
        carList.add(new Car("BMW", "Black", 599));
        carList.add(new Car("Porshe", "Red", 499));

    }
    @Override
    public List<Car> getCars() {
        return carList;
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        if (count > 0 && count < carList.size()) {
            return carList.subList(0, count);

        }
        return carList;
    }
}
