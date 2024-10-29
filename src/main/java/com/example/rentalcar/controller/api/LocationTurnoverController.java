package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.LocationTurnover;
import com.example.rentalcar.service.LocationTurnoverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationTurnoverController {
    LocationTurnoverService locationTurnoverService;

    public LocationTurnoverController(LocationTurnoverService locationTurnoverService) {
        this.locationTurnoverService = locationTurnoverService;
    }

    @GetMapping("/api/locations")
    public List<LocationTurnover> getAllLocations() {
        return locationTurnoverService.getAllLocationTurnover();
    }

    @GetMapping("/api/location/{id}")
    public Optional<LocationTurnover> getLocationById(@PathVariable Long id) {
        return locationTurnoverService.getLocationTurnoverById(id);
    }

    @PostMapping("/api/location")
    public LocationTurnover createLocationTurnover(@RequestBody LocationTurnover locationTurnover) {
        return locationTurnoverService.createLocationTurnover(locationTurnover);
    }

    @PostMapping("/api/locations")
    public List<LocationTurnover> createLocationTurnovers(@RequestBody List<LocationTurnover> locationTurnovers) {
        return locationTurnoverService.createLocationTurnovers(locationTurnovers);
    }

    @PutMapping("/api/location")
    public LocationTurnover updateLocationTurnover(@RequestBody LocationTurnover locationTurnover) {
        return locationTurnoverService.updateLocationTurnover(locationTurnover);
    }

    @DeleteMapping("/api/location/{id}")
    public String deleteLocationTurnover(@PathVariable Long id) {
        return locationTurnoverService.deleteLocationTurnover(id);
    }

    @DeleteMapping("/api/locations")
    public List<LocationTurnover> deleteLocationTurnovers(@RequestBody List<LocationTurnover> locationTurnovers) {
        return locationTurnoverService.deleteLocationTurnovers(locationTurnovers);
    }

//    @PostMapping("/api/location/save")
//    public LocationTurnover saveLocationTurnover(@RequestBody LocationTurnover locationTurnover) {
//        return locationTurnoverService.saveLocationTurnover(locationTurnover);
//    }
}
