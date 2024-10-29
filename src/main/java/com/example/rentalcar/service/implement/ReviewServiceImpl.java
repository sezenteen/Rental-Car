package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.Review;
import com.example.rentalcar.service.ReviewService;

import java.util.List;
import java.util.Optional;

public class ReviewServiceImpl implements ReviewService {
    @Override
    public List<Review> getAllReviews() {
        return List.of();
    }

    @Override
    public Optional<Review> getReviewById(Long id) {
        return Optional.empty();
    }

    @Override
    public Review createReview(Review review) {
        return null;
    }

    @Override
    public List<Review> createReviews(List<Review> reviews) {
        return List.of();
    }


    @Override
    public Review updateReview(Review review) {
        return null;
    }

    @Override
    public String deleteReview(Long id) {
        return "";
    }

    @Override
    public Review deleteReviews(List<Review> reviews) {
        return null;
    }
}
