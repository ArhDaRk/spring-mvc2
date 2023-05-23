package servise;

import model.Car;

import java.util.List;

public class CarsListImp implements CarsList {
    @Override
    public List<Car> getCarList() {
        return carList;
    }

    private List<Car> carList;

    @Override
    public void setCarList(int count, List<Car> carList) {
        if (count <= carList.size()) {
            this.carList = carList.subList(0, count);
        } else
            this.carList = carList;
    }

}
