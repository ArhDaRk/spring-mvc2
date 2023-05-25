package servise;

import model.Car;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
@ComponentScan(basePackages = "java.servise")
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(int count) {
        if (count >= 0 && count <= carList.size()) {
            carList = carList.subList(0, count);
        }
        return carList;
    }

    private List<Car> carList = Arrays.asList (
            new Car("Opel", 1999, "black"),
            new Car("Mazda", 2001, "white"),
            new Car("ZAZ", 2005, "red"),
            new Car("LADA", 2010, "yellow"),
            new Car("Chevrolet", 2007, "blue")
    );

}
