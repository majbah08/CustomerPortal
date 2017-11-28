package com.maestro.smilebdcp.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.maestro.smilebdcp.beans.CONNECTION_CATAGORY;
import com.maestro.smilebdcp.beans.DBBL_RESULT_CODE;
import com.maestro.smilebdcp.beans.PHONES;
import com.maestro.smilebdcp.beans.SMS_OUTBOX;
import com.maestro.smilebdcp.beans.PAYMENT;
import com.maestro.smilebdcp.beans.DBBL_TEMP_TRANS;
import com.maestro.smilebdcp.beans.DBBL_TRANS_LOG;
import com.maestro.smilebdcp.dao.CustomerDao;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void saveCustomer(PHONES customer) {
		customerDao.saveCustomer(customer);
	}
	
	@Override
	public PHONES loginCustomer(PHONES customer) {
	 return	customerDao.loginCustomer(customer);
	}
	
	@Override
	@Transactional
	public List<PAYMENT> showCustomerHistory(String cur_session){
		
		return customerDao.showCustomerHistory( cur_session) ;
	}
	
	public CONNECTION_CATAGORY PaymentDetails(long cat_id){
		
		
		return customerDao.PaymentDetails(cat_id);
	}
	
	public void saveTempTransDetails(DBBL_TEMP_TRANS dbbltemp ){
		
		
		 customerDao.saveTempTransDetails(dbbltemp);
	}
	
	@Override
	public PHONES findById(long id) {

		return customerDao.findById(id);
	}

	@Override
	public PHONES findByName(String name) {

		return customerDao.findByName(name);
	}
	
	@Override
	public void changePassword (PHONES customer) {
		customerDao.changePassword(customer);

	}

	@Override
	public void sendUserPass(SMS_OUTBOX smsOB) {
		customerDao.sendUserPass(smsOB);
		
	}
	@Override
	public PHONES findByEmail(String email){
		return customerDao.findByEmail(email);		
	}

	@Override
	public void saveSucessParam(DBBL_TRANS_LOG dbblLog) {
		 customerDao.saveSucessParam(dbblLog);
		
	}


	public DBBL_RESULT_CODE findByDbblResultCode(String resultcode) {
		
		return customerDao.findByDbblResultCode(resultcode);
	}
	 
	
	
}
