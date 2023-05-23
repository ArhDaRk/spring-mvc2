package servise;

import model.Car;

import java.util.List;

public interface CarsList {

    void setCarList (int count, List<Car> carList);

    List<Car> getCarList();
}
