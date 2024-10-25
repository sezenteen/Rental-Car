package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.CarRecord;
import com.example.rentalcar.service.CarRecordService;

import java.util.List;
import java.util.Optional;

public class CarRecordServiceImpl implements CarRecordService {
    @Override
    public List<CarRecord> getCarRecords() {
        return List.of();
    }

    @Override
    public CarRecord createCarRecord(CarRecord carRecord) {
        return null;
    }

    @Override
    public List<CarRecord> createCarRecords(List<CarRecord> carRecords) {
        return List.of();
    }

    @Override
    public Optional<CarRecord> getCarRecordById(Long id) {
        return Optional.empty();
    }

    @Override
    public CarRecord updateCarRecord(CarRecord carRecord) {
        return null;
    }

    @Override
    public String deleteCarRecordById(Long id) {
        return "";
    }

    @Override
    public Object deleteAllCarRecords(List<CarRecord> carRecords) {
        return null;
    }
}
