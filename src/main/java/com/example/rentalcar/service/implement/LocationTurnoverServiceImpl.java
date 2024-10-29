package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.LocationTurnover;
import com.example.rentalcar.service.LocationTurnoverService;

import java.util.List;
import java.util.Optional;

public class LocationTurnoverServiceImpl implements LocationTurnoverService {
    @Override
    public List<LocationTurnover> getAllLocationTurnover() {
        return List.of();
    }

    @Override
    public Optional<LocationTurnover> getLocationTurnoverById(long id) {
        return Optional.empty();
    }

    @Override
    public LocationTurnover createLocationTurnover(LocationTurnover locationTurnover) {
        return null;
    }

    @Override
    public List<LocationTurnover> createLocationTurnovers(List<LocationTurnover> locationTurnovers) {
        return List.of();
    }

    @Override
    public LocationTurnover saveLocationTurnover(LocationTurnover locationTurnover) {
        return null;
    }

    @Override
    public LocationTurnover updateLocationTurnover(LocationTurnover locationTurnover) {
        return null;
    }

    @Override
    public String deleteLocationTurnover(long id) {
        return "";
    }

    @Override
    public List<LocationTurnover> deleteLocationTurnovers(List<LocationTurnover> locationTurnovers) {
        return List.of();
    }
}
