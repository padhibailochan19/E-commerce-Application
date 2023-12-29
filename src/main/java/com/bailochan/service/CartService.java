package com.bailochan.service;

import com.bailochan.exception.ProductException;
import com.bailochan.modal.Cart;
import com.bailochan.modal.CartItem;
import com.bailochan.modal.User;
import com.bailochan.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
