package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serviñe.CarService;


@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService service) {
        this.carService = service;
    }
    @GetMapping(value = "cars")
    public String printCarsList(@RequestParam(required = false, defaultValue = "-1") int count, ModelMap model) {
            model.addAttribute("cars", carService.getCarList(count));
            return "cars";
    }
}
