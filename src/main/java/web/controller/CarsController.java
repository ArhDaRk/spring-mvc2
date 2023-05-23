package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import servise.CarsListImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "cars")
    public String printCarsList(ModelMap model) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Opel", 1999, "black"));
        cars.add(new Car("Mazda", 2001, "white"));
        cars.add(new Car("ZAZ", 2005, "red"));
        cars.add(new Car("LADA", 2010, "yellow"));
        cars.add(new Car("Chevrolet", 2007, "blue"));
        CarsListImp list = new CarsListImp();
        list.setCarList(2,cars);
        model.addAttribute("cars", list.getCarList());
        List<String> messages = new ArrayList<>();
        messages.add("CARS!");
        model.addAttribute("messages", messages);
        return "cars";
    }
}
