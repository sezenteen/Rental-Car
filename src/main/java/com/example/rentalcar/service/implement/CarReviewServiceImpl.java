package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.CarReview;
import com.example.rentalcar.service.CarReviewService;

import java.util.List;
import java.util.Optional;

public class CarReviewServiceImpl implements CarReviewService {

    @Override
    public List<CarReview> getAllCarReviews() {
        return List.of();
    }

    @Override
    public CarReview createCarReview(CarReview carReview) {
        return null;
    }

    @Override
    public Optional<CarReview> getCarReviewById(long id) {
        return Optional.empty();
    }

    @Override
    public CarReview updateCarReview(CarReview carReview) {
        return null;
    }

    @Override
    public String deleteCarReview(long id) {
        return "";
    }

    @Override
    public List<CarReview> deleteCarReviews(List<CarReview> carReviews) {
        return List.of();
    }

    @Override
    public List<CarReview> createCarReviews(List<CarReview> carReviews) {
        return List.of();
    }
}
