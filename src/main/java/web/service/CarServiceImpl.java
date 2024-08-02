package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>() {{
        add(new Car(1, "Mazda", "3"));
        add(new Car(2, "Mazda", "5"));
        add(new Car(3, "Mazda", "CX 7"));
        add(new Car(4, "Mazda", "CX 9"));
        add(new Car(5, "Tesla", "Model 3"));
    }};

    @Override
    public List<Car> getCountCars(int c) {
        return cars.stream().limit(c).toList();
    }
}
