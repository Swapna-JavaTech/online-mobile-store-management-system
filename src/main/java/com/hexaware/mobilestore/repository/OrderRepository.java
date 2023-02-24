package com.hexaware.mobilestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.mobilestore.entity.Order;



@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}