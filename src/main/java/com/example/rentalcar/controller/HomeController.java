package com.example.rentalcar.controller;

import com.example.rentalcar.service.BrandService;
import com.example.rentalcar.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private final BrandService brandService;
    private final CarService carService;

    public HomeController(BrandService brandService, CarService carService) {
        this.brandService = brandService;
        this.carService = carService;
    }

    @GetMapping("/")
    public String home(Model model, @RequestParam(name = "id", defaultValue = "1") Long id ) {
        model.addAttribute("brands", brandService.getAllBrands());
        model.addAttribute("cars", carService.getAllCars());
        return "index";
    }
}
