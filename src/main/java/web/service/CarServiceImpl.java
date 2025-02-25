package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        List<Car> cars;
        if (count > 0 && count < 5) {
            cars = carDAO.getAllCars().stream().limit(count).toList();
        } else {
            cars = carDAO.getAllCars();
        }
        return cars;
    }
}
