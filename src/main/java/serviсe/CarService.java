package serviñe;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CarService {

    List<Car> getCarList(int count);
}
