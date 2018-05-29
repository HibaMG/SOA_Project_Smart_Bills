package com.javainuse.allBills;

import io.swagger.annotations.ApiParam;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import springfox.documentation.annotations.Incubating;
import springfox.documentation.spring.web.json.Json;

@RestController
public class AllBillsController {
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String getAllBills(String billId,String userId) throws JSONException {
		AllBills allBills = new AllBills();
		billId="1";
		userId="1165536";
		return allBills.getAllBills(billId,userId); 
	}

}
