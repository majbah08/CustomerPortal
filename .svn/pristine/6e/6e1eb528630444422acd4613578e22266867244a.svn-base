package com.maestro.smilebdcp.dao;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;

import com.maestro.smilebdcp.beans.CONNECTION_CATAGORY;
import com.maestro.smilebdcp.beans.DBBL_RESULT_CODE;
import com.maestro.smilebdcp.beans.PHONES;
import com.maestro.smilebdcp.beans.SMS_OUTBOX;
import com.maestro.smilebdcp.beans.PAYMENT;
import com.maestro.smilebdcp.beans.DBBL_TEMP_TRANS;
import com.maestro.smilebdcp.beans.DBBL_TRANS_LOG;


/**
*
* @author Majbah-Hashem
*/
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	private PHONES customer;
	
	public void setSessionFactory(SessionFactory sessionfactory) {
		this.sessionFactory = sessionfactory;
	}

	@Override
	public void saveCustomer(PHONES customer) {
	
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(customer!=null){
			try {
				

               Random rand = new Random();

                int  rand_num = rand.nextInt(999999) + 213456;
                String pass =String.valueOf(rand_num);
                System.out.print(pass);
            		  
            		  
            	customer.setUSER_PASS(pass);	  
				session.save(customer);
			
				//session.update(customer); /// to update  customers new password to existing field
				tx.commit();
				session.close();
			} catch (Exception e) {
				tx.rollback();
				session.close();
				e.printStackTrace();
			}
		}

	}
	
	
	
	@Override
	public PHONES loginCustomer(PHONES customer) {
		System.out.print("Test Dao1");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from com.maestro.smilebdcp.beans.PHONES as c where c.SMILEBD_EMAIL =? and c.SUPER_PASS =?";
		//String hql = "from com.maestro.smilebdcp.beans.PHONES as c , com.maestro.smilebdcp.beans.CONNECTION_CATAGORY as d  where c.CATAGORY_ID=d.ID and c.SMILEBD_EMAIL =? and c.USER_PASS =?";
		System.out.print("ggwp"+hql);
		try {
			Query query = session.createQuery(hql);
			query.setParameter(0, customer.getSMILEBD_EMAIL());
			query.setParameter(1, customer.getSUPER_PASS());
			customer = (PHONES) query.uniqueResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		
		//String verified_phone1= customer.getCUSTOMER_NAME();
		
    			
		return customer;
	}

	
	
	public PHONES findById(long id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		PHONES customer = new PHONES();
		try {
			customer = (PHONES) session.get(PHONES.class, id);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			session.close();
		}
		return customer;
	}

	
	
	public PHONES findByName(String name) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		PHONES customer = new PHONES();
		String hql = "from com.crud.rest.beans.PHONES where name = ?";
		try {
			Query query = session.createQuery(hql);
			query.setParameter(0, name);
			customer = (PHONES) query.uniqueResult();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			session.close();
		}
		return customer;
	}

	
	
	
	
	
	
	
	
	
	//Get Payment History for current user(Last 6 month data)
	
	@SuppressWarnings("unchecked")
	
	public List<PAYMENT> showCustomerHistory(String cur_session){
		
		
			Calendar cal_now = Calendar.getInstance();
	   
	    	Date date_now = cal_now.getTime();
	    	System.out.println("date"+date_now);
	    
	        Calendar cal_prev = Calendar.getInstance();
		    cal_prev.add(Calendar.MONTH, -6);
		    Date date_prev = cal_prev.getTime();
		    
		    System.out.println("Fromdate"+date_prev);
		  
		    
		
		    List<PAYMENT> paymentlist =  new ArrayList<PAYMENT>();
		    Session session = this.sessionFactory.openSession();
		    Transaction tx = session.beginTransaction();
		    String hql="from com.maestro.smilebdcp.beans.PAYMENT c where c.PHONENO=? and c.PAY_DATE BETWEEN :date_prev and :date_now  ";
		    try{
			Query query=session.createQuery(hql);
			query.setParameter(0, cur_session);
			query.setParameter("date_prev", date_prev);
			query.setParameter("date_now", date_now);
			
			paymentlist =  query.list();
			//System.out.print("GG"+paymentlist);
			tx.commit();
			session.close();
			
		} catch(Exception e){
			tx.rollback();
			session.close();
			e.printStackTrace();
			
			
		}
		
		return	 paymentlist;
	}
	

	@SuppressWarnings("unchecked")
	public CONNECTION_CATAGORY PaymentDetails(long cat_id) {
		
		CONNECTION_CATAGORY conn_cat= new CONNECTION_CATAGORY();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from com.maestro.smilebdcp.beans.CONNECTION_CATAGORY as c where c.ID=?";
		
		System.out.print("ggwp"+hql);
		try {
			Query query = session.createQuery(hql);
			query.setParameter(0, cat_id);
			
			conn_cat = (CONNECTION_CATAGORY) query.uniqueResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		return conn_cat;
	}
	
	// save Temporary Data before actual DBBL transaction occurs
	
	public void saveTempTransDetails(DBBL_TEMP_TRANS dbbltemp) {
	
	   System.out.println(dbbltemp);
		String gg= dbbltemp.getPHONENO();
		System.out.println("PayPhone"+gg);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(dbbltemp!=null){
			try {
				
				session.save(dbbltemp);
			
				
				tx.commit();
				session.close();
			} catch (Exception e) {
				tx.rollback();
				session.close();
				e.printStackTrace();
			}
		}
          
	}
	
	

	// Change Password PAGE
	
	@Override
	public void changePassword(PHONES customer) {
		System.out.println("OK Please");
		String super_Pass=customer.getSUPER_PASS();
		System.out.println("Superpass"+super_Pass);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		if (customer != null) {
			try {
				session.update(customer);
				transaction.commit();
			} catch (Exception e) {
				transaction.rollback();
				session.close();
			}

		}

		
	}

	@Override
	public void sendUserPass(SMS_OUTBOX smsOB) {
		
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(smsOB!=null){
			try {
				
				session.save(smsOB);
			
				
				tx.commit();
				session.close();
			} catch (Exception e) {
				tx.rollback();
				session.close();
				e.printStackTrace();
			}
		}
          
		
		
		
		
		
		
	}
	
	public DBBL_RESULT_CODE findByDbblResultCode(String resultcode) {
		Session session = sessionFactory.openSession();		
		Transaction transaction = session.beginTransaction();
		DBBL_RESULT_CODE customer = new DBBL_RESULT_CODE();
		String hql = "from com.maestro.smilebdcp.beans.DBBL_RESULT_CODE as c where c.RESULT_CODE =?";
		System.out.println("hsql "+hql);
		try {
			Query query = session.createQuery(hql);			
			query.setParameter(0, resultcode);
			customer = (DBBL_RESULT_CODE) query.uniqueResult();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			session.close();
		}		
		return customer;
		
	}
	
	
	

	public PHONES findByEmail(String email) {
		Session session = sessionFactory.openSession();		
		Transaction transaction = session.beginTransaction();
		PHONES customer = new PHONES();
		String hql = "from com.maestro.smilebdcp.beans.PHONES as c where c.SMILEBD_EMAIL =?";
		System.out.println("hsql "+hql);
		try {
			Query query = session.createQuery(hql);			
			query.setParameter(0, email);
			customer = (PHONES) query.uniqueResult();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			session.close();
		}		
		return customer;
		
	}

	@Override
	public void saveSucessParam(DBBL_TRANS_LOG dbblLog) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(dbblLog!=null){
			try {
				
				session.save(dbblLog);
			
				
				tx.commit();
				session.close();
			} catch (Exception e) {
				tx.rollback();
				session.close();
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}

