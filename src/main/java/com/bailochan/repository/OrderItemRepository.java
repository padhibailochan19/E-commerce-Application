package com.bailochan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bailochan.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
