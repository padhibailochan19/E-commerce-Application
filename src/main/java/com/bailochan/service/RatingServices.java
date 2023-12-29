package com.bailochan.service;

import java.util.List;

import com.bailochan.exception.ProductException;
import com.bailochan.modal.Rating;
import com.bailochan.modal.User;
import com.bailochan.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
