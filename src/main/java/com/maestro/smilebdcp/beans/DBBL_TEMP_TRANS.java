package com.maestro.smilebdcp.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DBBL_TEMP_TRANS")
public class DBBL_TEMP_TRANS {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long ID;
	
	@Column
	private Date TXN_DATE;
	
	@Column
	private String TXN_DESC;
	
	@Column
	private String CARD_TYPE;
	
	@Column
	private String TXN_ID;
	
	@Column
	private String CUSTOMER_IP;
	
	@Column
	private String PHONENO;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Date getTXN_DATE() {
		return TXN_DATE;
	}

	public void setTXN_DATE(Date tXN_DATE) {
		TXN_DATE = tXN_DATE;
	}

	public String getTXN_DESC() {
		return TXN_DESC;
	}

	public void setTXN_DESC(String tXN_DESC) {
		TXN_DESC = tXN_DESC;
	}

	public String getCARD_TYPE() {
		return CARD_TYPE;
	}

	public void setCARD_TYPE(String cARD_TYPE) {
		CARD_TYPE = cARD_TYPE;
	}

	public String getTXN_ID() {
		return TXN_ID;
	}

	public void setTXN_ID(String tXN_ID) {
		TXN_ID = tXN_ID;
	}

	public String getCUSTOMER_IP() {
		return CUSTOMER_IP;
	}

	public void setCUSTOMER_IP(String cUSTOMER_IP) {
		CUSTOMER_IP = cUSTOMER_IP;
	}

	public String getPHONENO() {
		return PHONENO;
	}

	public void setPHONENO(String pHONENO) {
		PHONENO = pHONENO;
	}
	

	
	

}
