package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.CarRecord;
import com.example.rentalcar.service.CarRecordService;
import com.example.rentalcar.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarRecordController {
    private final CarService carService;
    private final CarRecordService carRecordService;

    public CarRecordController(CarService carService, CarRecordService carRecordService) {
        this.carService = carService;
        this.carRecordService = carRecordService;
    }

    @GetMapping("/api/carRecords")
    public List<CarRecord> getAllCarRecords() {
        return carRecordService.getCarRecords();
    }

    @PostMapping("/api/carRecord")
    public CarRecord addCarRecord(@RequestBody CarRecord carRecord) {
        return carRecordService.createCarRecord( carRecord );
    }
}
