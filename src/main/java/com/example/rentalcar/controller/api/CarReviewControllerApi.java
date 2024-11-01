package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.CarReview;
import com.example.rentalcar.service.CarReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarReviewControllerApi {
    CarReviewService carReviewService;

    public CarReviewControllerApi(CarReviewService carReviewService) {
        this.carReviewService = carReviewService;
    }

    @GetMapping("/api/carreviews")
    public List<CarReview> getAllCarReviews() {
        return carReviewService.getAllCarReviews();
    }

    @PostMapping("/api/carreview")
    public CarReview addCarReview(@RequestBody CarReview carReview) {
        return carReviewService.createCarReview(carReview);
    }

    @PostMapping("/api/carreviews")
    public List<CarReview> addCarReviews(@RequestBody List<CarReview> carReviews) {
        return carReviewService.createCarReviews(carReviews);
    }

    @GetMapping("/api/carreviews/{id}")
    public Optional<CarReview> getCarReviewById(@PathVariable Long id) {
        return carReviewService.getCarReviewById(id);
    }

    @PutMapping("/api/carreview")
    public CarReview editCarReview(@RequestBody CarReview carReview) {
        return carReviewService.updateCarReview(carReview);
    }

    @DeleteMapping("/api/carreview/{id}")
    public String deleteCarReview(@PathVariable Long id) {
        return carReviewService.deleteCarReview(id);
    }

    @DeleteMapping("/api/carreviews")
    public String deleteCarReviews(@RequestBody List<CarReview> carReviews) {
        return carReviewService.deleteCarReviews(carReviews).toString();
    }
}
