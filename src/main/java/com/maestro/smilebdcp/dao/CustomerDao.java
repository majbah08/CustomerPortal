package com.maestro.smilebdcp.dao;

import java.sql.Date;
import java.util.List;

import com.maestro.smilebdcp.beans.CONNECTION_CATAGORY;
import com.maestro.smilebdcp.beans.DBBL_RESULT_CODE;
import com.maestro.smilebdcp.beans.DBBL_TEMP_TRANS;
import com.maestro.smilebdcp.beans.DBBL_TRANS_LOG;
import com.maestro.smilebdcp.beans.PHONES;
import com.maestro.smilebdcp.beans.PAYMENT;
import com.maestro.smilebdcp.beans.SMS_OUTBOX;;

public interface CustomerDao {

	public void saveCustomer(PHONES customer);

	public PHONES loginCustomer(PHONES customer);
	
	public List <PAYMENT> showCustomerHistory(String cur_session);
	
	public CONNECTION_CATAGORY PaymentDetails(long cat_id);
	
	public void saveTempTransDetails(DBBL_TEMP_TRANS dbbltemp);
	
	PHONES findById(long id);

	PHONES findByName(String name);
   
	

	public void changePassword(PHONES customer);
	
	
	public void sendUserPass(SMS_OUTBOX smsOB);
	public PHONES  findByEmail(String email);
	
	public DBBL_RESULT_CODE findByDbblResultCode(String resultcode);
	
	public void saveSucessParam(DBBL_TRANS_LOG dbblLog);
	

	
}
