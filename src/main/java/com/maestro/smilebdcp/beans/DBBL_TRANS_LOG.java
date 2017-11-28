package com.maestro.smilebdcp.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DBBL_TRANS_LOG")
public class DBBL_TRANS_LOG {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;
	
	
	@Column
	private String TRANS_ID;
	@Column
	private String TRANS_DATE;
	@Column
	private String RESULT;
	@Column
	private String RESULT_CODE;
	@Column
	private String PRN;
	@Column
	private String CARD_NUMBER;
	@Column
	private String AMOUNT;
	@Column
	private String TRANS_DESC;
	@Column
	private String TRANSDATE;
	@Column
	private String CARD_NAME;
	@Column
	private String DSECURE;
	@Column
	private String APPROVAL_CODE;
	
	
	
	
	public String getAPPROVAL_CODE() {
		return APPROVAL_CODE;
	}
	public void setAPPROVAL_CODE(String aPPROVAL_CODE) {
		APPROVAL_CODE = aPPROVAL_CODE;
	}
	public String getTRANS_ID() {
		return TRANS_ID;
	}
	public void setTRANS_ID(String tRANS_ID) {
		TRANS_ID = tRANS_ID;
	}
	
	public String getTRANS_DATE() {
		return TRANS_DATE;
	}
	public void setTRANS_DATE(String tRANS_DATE) {
		TRANS_DATE = tRANS_DATE;
	}
	public String getRESULT() {
		return RESULT;
	}
	public void setRESULT(String rESULT) {
		RESULT = rESULT;
	}
	public String getRESULT_CODE() {
		return RESULT_CODE;
	}
	public void setRESULT_CODE(String rESULT_CODE) {
		RESULT_CODE = rESULT_CODE;
	}
	public String getPRN() {
		return PRN;
	}
	public void setPRN(String pRN) {
		PRN = pRN;
	}
	public String getCARD_NUMBER() {
		return CARD_NUMBER;
	}
	public void setCARD_NUMBER(String cARD_NUMBER) {
		CARD_NUMBER = cARD_NUMBER;
	}
	public String getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getTRANS_DESC() {
		return TRANS_DESC;
	}
	public void setTRANS_DESC(String tRANS_DESC) {
		TRANS_DESC = tRANS_DESC;
	}
	public String getTRANSDATE() {
		return TRANSDATE;
	}
	public void setTRANSDATE(String tRANSDATE) {
		TRANSDATE = tRANSDATE;
	}
	public String getCARD_NAME() {
		return CARD_NAME;
	}
	public void setCARD_NAME(String cARD_NAME) {
		CARD_NAME = cARD_NAME;
	}
	public String getDSECURE() {
		return DSECURE;
	}
	public void setDSECURE(String dSECURE) {
		DSECURE = dSECURE;
	}
	
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	
	
	
}
