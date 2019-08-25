package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.OrderClass;

@RestController
public class OrderRequestController {

	@RequestMapping(method = RequestMethod.POST,path = "/order",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String getRequest(@RequestBody OrderClass orderParam) {
		System.out.println(orderParam.getOrder().getOrderType());
		
		return "success";
		
	}
}
