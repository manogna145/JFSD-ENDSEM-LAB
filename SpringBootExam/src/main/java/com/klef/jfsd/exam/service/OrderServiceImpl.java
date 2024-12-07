package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.repository.OrderRepo;

@Service
public class OrderServiceImpl {

	@Autowired
	OrderRepo orderRepo;
	
	public List<Order> getAll() {

		return orderRepo.findAll();
	}

}
