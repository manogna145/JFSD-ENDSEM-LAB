package com.klef.jfsd.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
