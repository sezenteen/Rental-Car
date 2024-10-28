package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.CarReview;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CarReviewService {

    List<CarReview> getAllCarReviews();

    public CarReview createCarReview(CarReview carReview);

    List<CarReview> getCarReviewsByCarId(List<CarReview> carReviews);

    public Optional<CarReview> getCarReviewById(long id);

    public CarReview updateCarReview(CarReview carReview);

    public String deleteCarReview(long id);

    List<CarReview> deleteCarReviews(List<CarReview> carReviews);

    List<CarReview> createCarReviews(List<CarReview> carReviews);
}
