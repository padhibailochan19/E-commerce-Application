package com.bailochan.service;

import com.bailochan.exception.UserException;
import com.bailochan.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
