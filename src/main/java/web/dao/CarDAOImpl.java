package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Toyota", 4, LocalDate.of(2021, 2, 15)));
        cars.add(new Car("Honda", 2, LocalDate.of(2022, 3, 20)));
        cars.add(new Car("BMW", 6, LocalDate.of(2020, 1, 10)));
        cars.add(new Car("Mercedes", 3, LocalDate.of(2023, 4, 25)));
        cars.add(new Car("Mitsubishi", 5, LocalDate.of(2024, 5, 30)));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return cars.stream().limit(count).toList();
    }
}
