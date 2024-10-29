package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReviewService {
    // Get
    List<Review> getAllReviews();

    public Optional<Review> getReviewById(Long id);

    // Create
    public Review createReview(Review review);

    List<Review> createReviews(List<Review> reviews);

    // Update
    public Review updateReview(Review review);

    // Delete
    public String deleteReview(Long id);

    public Review deleteReviews(List<Review> reviews);
}
