package com.bailochan.service;

import java.util.List;

import com.bailochan.exception.ProductException;
import com.bailochan.modal.Review;
import com.bailochan.modal.User;
import com.bailochan.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
