package com.javainuse.allBills;

import java.sql.Date;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.util.JSONPObject;

import springfox.documentation.spring.web.json.Json;


public class  AllBills{
	
	public  String identityNo ; 
	public Float electricBillDetails;
	public Float waterBillDetails;
	public  Float  totalBills  ;  
	public String address ; 
	public String billDetails ; 
	public String electricPayBeforDate ;
	public String electricPublishDate ;
	public String waterPayBeforDate ;
	public String waterPublishDate ;
	
	
	
	public AllBills( ){
		
	}
	public String getId() {
		return identityNo;
	}
	public void setId(String identityNo) {
		this.identityNo = identityNo;
	}
	public Float getTotal() {
		return totalBills;
	}
	public void setTotal(Float totalBills) {
		this.totalBills = totalBills;
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
	public String getElectricPublishDate() {
		return  electricPublishDate;
	}
	public void setElectricPublishDate(String electricpublishDate) {
		this.electricPublishDate = electricpublishDate;
	}
	public String getElectricPayBeforDate() {
		return electricPayBeforDate;
	}
	public void setElectricPayBeforDate(String waterPayBeforDate) {
		this.waterPayBeforDate = waterPayBeforDate;
	} 
	public String getWaterPayBeforDate() {
		return electricPayBeforDate;
	}
	public void setWaterPayBeforDate(String waterPayBeforDate) {
		this.waterPayBeforDate = waterPayBeforDate;
	}
	 public String  getAllBills(String billId,String userId ) throws JSONException{
//		 JSONObject  allBills = new JSONObject();
//
//		 allBills.put("billId", billId); 
//		 allBills.put("userId", userId);
//		 allBills.put("totalBills", 206.36);
//		 allBills.put("address", "ramallah/alnahda Str");
//		 allBills.put("billDetails", "Bill Details.....");
//		 allBills.put("waterPublishDate", new Date(10, 05, 2018));
//		 allBills.put("waterPayBeforDate", new Date(10, 06, 2018));
//		 allBills.put("electricBill", 100.76);
//		 allBills.put("waterBill", 105.6);
//		 allBills.put("electricPublishDate", new Date(2018-1900, 4, 15));
//		 allBills.put("electricPayBeforDate", new Date(2018-1900,5, 20));
//	
//		
//		 return allBills;
		 setId(userId);
		 
		 return  "{"
			+ "\"User Id\": { \"userId\":\""+ userId +"\", \"address\":"
		+ " \"ramallah_al nahda St \",\"Total\": \"206.36\", \"billDetails\": \"This is Electricity and water bill....\",\"Electric Bill\": \"100.76\",\"Water Bill\": \"105.6\", \"electricPublishDate\":"
		+  new Date(2018-1900, 4, 15 )+","
		+ "\"electricPayBeforDate\":"
		+new Date(2018-1900,5, 20 )+","
		+ "\"waterPublishDate\":"
		+  new Date(10, 05, 2018 )+","
		+ "\"waterPayBeforDate\":"
		+  new Date(10, 06, 2018 )
		
		
		
		
		+ "}"
		+"}";
	 }
	
	
}
