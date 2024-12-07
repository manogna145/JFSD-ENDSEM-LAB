package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.OrderServiceImpl;


@RestController
public class OrderController {
	
	@Autowired
	OrderServiceImpl orderServiceImpl;
	
	@GetMapping("/getall")
	public List<Order> getall()
	{
		return orderServiceImpl.getAll();
	}

}
