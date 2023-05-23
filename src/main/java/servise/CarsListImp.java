package servise;

import model.Car;

import java.util.List;

public class CarsListImp implements CarsList {

    public List<Car> getCarList() {
        return carList;
    }

    private List<Car> carList;

    @Override
    public void setCarList (int count, List<Car> carList) {
        this.carList = carList.subList(0, count);
    }

}
