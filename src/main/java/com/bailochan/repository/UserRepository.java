package com.bailochan.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bailochan.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
