package com.bailochan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bailochan.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
