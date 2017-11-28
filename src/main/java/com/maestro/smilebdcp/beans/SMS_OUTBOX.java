package com.maestro.smilebdcp.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "SMS_OUTBOX")
public class SMS_OUTBOX {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
    generator = "SMS_OUTBOX_SQ")
	@SequenceGenerator(name = "SMS_OUTBOX_SQ", 
    sequenceName = "SMS_OUTBOX_SQ")
	private Long ID;
	
	@Column
	private String MOBILE;
	
	@Column 
	private String MSG;
	
	@Column 
	private Date ENTRY_DATE;
	
	@Column 
	private Integer MODEM_ID=4;

	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getMOBILE() {
		return MOBILE;
	}

	public void setMOBILE(String mOBILE) {
		MOBILE = mOBILE;
	}

	public String getMSG() {
		return MSG;
	}

	public void setMSG(String mSG) {
		MSG = mSG;
	}

	public Date getENTRY_DATE() {
		return ENTRY_DATE;
	}

	public void setENTRY_DATE(Date eNTRY_DATE) {
		ENTRY_DATE = eNTRY_DATE;
	}

	public Integer getMODEM_ID() {
		return MODEM_ID;
	}

	public void setMODEM_ID(Integer mODEM_ID) {
		MODEM_ID = mODEM_ID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
