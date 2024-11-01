package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.Review;
import com.example.rentalcar.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReviewControllerApi {
    ReviewService reviewService;

    public ReviewControllerApi(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/api/reviews")
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/api/review/{id}")
    public Optional<Review> getReviewById(@PathVariable Long id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping("/api/review")
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @PostMapping("/api/reviews")
    public List<Review> createReviews(@RequestBody List<Review> reviews) {
        return reviewService.createReviews(reviews);
    }

    @PutMapping("/api/review")
    public Review updateReview(@RequestBody Review review) {
        return reviewService.updateReview(review);
    }

    @DeleteMapping("/api/review/{id}")
    public String deleteReview(@PathVariable Long id) {
        return reviewService.deleteReview(id);
    }

    @DeleteMapping("/api/reviews")
    public Review deleteReviews(@RequestBody List<Review> reviews) {
        return reviewService.deleteReviews(reviews);
    }
}
