package com.javainuse.electricBills;

import io.swagger.annotations.ApiParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.Incubating;
import springfox.documentation.spring.web.json.Json;

@RestController
public class ElectricBillsController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String ElectricBills(@ApiParam(value = "testId")  String id) {
		ElectricBills obj = new  ElectricBills(); 
		return obj.getElectricBill("1165536"); //"Swagger Hello World"+ id ;
	}
}
