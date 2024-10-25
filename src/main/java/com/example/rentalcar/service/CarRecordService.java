package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.CarRecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CarRecordService {
    // List harah
    List<CarRecord> getCarRecords();

    // Mashin bvrtgeliin medeelel nemeh
    public CarRecord createCarRecord(CarRecord carRecord);

    // create more
    List<CarRecord> createCarRecords(List<CarRecord> carRecords);

    // get by id
    Optional<CarRecord> getCarRecordById(Long id);

    // update
    public CarRecord updateCarRecord(CarRecord carRecord);

    // delete by ID
    public String deleteCarRecordById(Long id);

    // delete all
    Object deleteAllCarRecords(List<CarRecord> carRecords);
}
