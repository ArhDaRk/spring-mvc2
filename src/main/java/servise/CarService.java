package servise;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CarService {


    List<Car> getCarList(int count);
}
