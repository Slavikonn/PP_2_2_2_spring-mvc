package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
public class CarController {
    private final CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "0") int count,
                            Model model) {
        List<Car> cars;
        if (count > 0 && count < 5) {
            cars = carService.getCarsByCount(count);
        } else {
            cars = carService.getAllCars();
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
