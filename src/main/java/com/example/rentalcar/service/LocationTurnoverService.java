package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.LocationTurnover;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LocationTurnoverService {
    // Get
    List<LocationTurnover> getAllLocationTurnover();

    public Optional<LocationTurnover> getLocationTurnoverById(long id);

    // Create
    public LocationTurnover createLocationTurnover(LocationTurnover locationTurnover);

    List<LocationTurnover> createLocationTurnovers(List<LocationTurnover> locationTurnovers);

    // save
//     public LocationTurnover saveLocationTurnover(LocationTurnover locationTurnover);

     // update
    public LocationTurnover updateLocationTurnover(LocationTurnover locationTurnover);

    // Delete
    public String deleteLocationTurnover(long id);

    List<LocationTurnover> deleteLocationTurnovers(List<LocationTurnover> locationTurnovers);
}
