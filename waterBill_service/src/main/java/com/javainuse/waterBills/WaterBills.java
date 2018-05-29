package com.javainuse.waterBills;

import java.sql.Date;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.util.JSONPObject;

import springfox.documentation.spring.web.json.Json;

public class WaterBills {

	public  String id ; 
	public  Float  total  ; 
	public String Area ; 
	public String address ; 
	public String billDetails ; 
	public String publishDate ; 
	public String payBeforDate ;
	
	public WaterBills ( ){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBillDetails() {
		return billDetails;
	}
	public void setBillDetails(String billDetails) {
		this.billDetails = billDetails;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getPayBeforDate() {
		return payBeforDate;
	}
	public void setPayBeforDate(String payBeforDate) {
		this.payBeforDate = payBeforDate;
	} 
	 public String   getWaterBill( String id ) {
//		 Json  waterBill ;//=new Json(); //{ "id":"John", "age":30, "car":null };

//		 try {
//			 waterBill.
//			waterBill.put("id", id);
//			waterBill.put("total", 105.6);
//			 waterBill.put("address", "ramallah/alnahda Str");
//			 waterBill.put("billDetails", "Bill Details.....");
//			 waterBill.put("publishDate", new Date(10, 05, 2018));
//			 waterBill.put("payBeforDate", new Date(10, 06, 2018));
//			
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		//String str =  "{" +"\"id\": ", "address": "100.87", "address": "ramallah_al nahda St"+"}"; 
		
				
				//"billDetails": "billDetails.....", "publishDate": new Date(10, 05, 2018), "payBeforDate": new Date(10, 06, 2018) ,


		 return  "{"
					+ "\"Water Bill\": { \"id\":\""+ id +"\", \"address\":"
		 		+ " \"ramallah_al nahda St \",\"Total\": \"100.76\", \"billDetails\": \"billDetails.....\", \"publishDate\":"
		 		+  new Date(2018-1900, 4, 15 )+","
		 		+ "\"payBeforDate\":"
		 		+new Date(2018-1900,5, 20 )
		 		
		 		+ "}"
		 		+"}";
	 }
	
}
