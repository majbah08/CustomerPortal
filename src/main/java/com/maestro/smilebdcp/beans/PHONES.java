package com.maestro.smilebdcp.beans;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "PHONES")

public class PHONES {
	  @Id
	  private Long ID;
	  @NotEmpty
		@Column
	  private String PHONENO;
	  @NotEmpty
		@Column
	  private String SUPER_PASS;
	  @NotEmpty
		@Column
	  private String USER_PASS;
	  @NotEmpty
		@Column
	  private String SIP_PASS;
	 
		@Column
	  private Long OWNER_ID;
	 
		@Column
	  private Character IS_SOLD;
	
		@Column
	  private String ATTACHED_DID;

		@Column
	  private String MAC;
	 
	
		@Column
	  private String CUSTOMER_NAME;
	
		@Column
	  private String ADDRESS;
	
		@Column
	  private String CONTACT_NO;
	
		@Column
	  private String EMAIL;
	
		@Column
	  private String SMILEBD_EMAIL;
	 
		@Column
	  private String CONTACT_PERSON;
	 
		@Column
	  private String DESIGNATION;
	  
		@Column
	  private String FAX;
	 
		@Column
	  private Long POP_ID;
	 
		@Column
	  private String CONN_STATUS;
	  
		@Column
	  private Date  CONN_EXPIRY_DATE;
	 
		@Column
	  private Long  CATAGORY_ID ;
	
		@Column
	  private String IP;
	
		@Column
	  private Character VERIFIED ;
	  
		@Column
	  private String WARD;
	  
		@Column
	  private String AREA;
	  
		@Column
	  private Long BILL_CYCLE;
	  
		@Column
	  private Double BILL;
	  
	
	  
	
		@Column
	  private Double INST_CHARGE;
	  
		@Column
	  private Double CONNECTION_FEE;
	  
		@Column
	  private Double COMISSION;
	  
		@Column
	  private Double VAT;
	  
		@Column
	  private Double INST_CHARGE_COMISSION;
	  
		@Column
	  private Double RECIEVED_AMT;
	  
		@Column
	  private Double ACCID;
	  
	
	 
		@Column
	  private Date CONN_CREATIONDATE ;
	 

	 

	
		@Column
	private Date ACTIVATION_DATE ;
	  
		@Column
	private Long AREA_ID;
	  
		@Column
	private  Long SOLD_BY;
	  
	private Long ADDRESS_ID;

	  
		@Column
	private String REMARKS;
	  
	
	 
	
	  
		@Column
	private  Date DATE_OF_BIRTH;
	
		@Column
	private  Integer BALANCE;
	 
		@Column
	private  String IS_FRAC;
    
	@Column	
	private String IS_MOBILE_VERIFIED;	
		
		
		
		

		public Long getID() {
			return ID;
		}

		public void setID(Long iD) {
			ID = iD;
		}

		public String getPHONENO() {
			return PHONENO;
		}

		public void setPHONENO(String pHONENO) {
			PHONENO = pHONENO;
		}

		public String getSUPER_PASS() {
			return SUPER_PASS;
		}

		public void setSUPER_PASS(String sUPER_PASS) {
			SUPER_PASS = sUPER_PASS;
		}

		public String getUSER_PASS() {
			return USER_PASS;
		}

		public void setUSER_PASS(String uSER_PASS) {
			USER_PASS = uSER_PASS;
		}

		public String getSIP_PASS() {
			return SIP_PASS;
		}

		public void setSIP_PASS(String sIP_PASS) {
			SIP_PASS = sIP_PASS;
		}

		public Long getOWNER_ID() {
			return OWNER_ID;
		}

		public void setOWNER_ID(Long oWNER_ID) {
			OWNER_ID = oWNER_ID;
		}

		public Character getIS_SOLD() {
			return IS_SOLD;
		}

		public void setIS_SOLD(Character iS_SOLD) {
			IS_SOLD = iS_SOLD;
		}

		public String getATTACHED_DID() {
			return ATTACHED_DID;
		}

		public void setATTACHED_DID(String aTTACHED_DID) {
			ATTACHED_DID = aTTACHED_DID;
		}

		public String getMAC() {
			return MAC;
		}

		public void setMAC(String mAC) {
			MAC = mAC;
		}

		public String getCUSTOMER_NAME() {
			return CUSTOMER_NAME;
		}

		public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
			CUSTOMER_NAME = cUSTOMER_NAME;
		}

		public String getADDRESS() {
			return ADDRESS;
		}

		public void setADDRESS(String aDDRESS) {
			ADDRESS = aDDRESS;
		}

		public String getCONTACT_NO() {
			return CONTACT_NO;
		}

		public void setCONTACT_NO(String cONTACT_NO) {
			CONTACT_NO = cONTACT_NO;
		}

		public String getEMAIL() {
			return EMAIL;
		}

		public void setEMAIL(String eMAIL) {
			EMAIL = eMAIL;
		}

		public String getSMILEBD_EMAIL() {
			return SMILEBD_EMAIL;
		}

		public void setSMILEBD_EMAIL(String sMILEBD_EMAIL) {
			SMILEBD_EMAIL = sMILEBD_EMAIL;
		}

		public String getCONTACT_PERSON() {
			return CONTACT_PERSON;
		}

		public void setCONTACT_PERSON(String cONTACT_PERSON) {
			CONTACT_PERSON = cONTACT_PERSON;
		}

		public String getDESIGNATION() {
			return DESIGNATION;
		}

		public void setDESIGNATION(String dESIGNATION) {
			DESIGNATION = dESIGNATION;
		}

		public String getFAX() {
			return FAX;
		}

		public void setFAX(String fAX) {
			FAX = fAX;
		}

		public Long getPOP_ID() {
			return POP_ID;
		}

		public void setPOP_ID(Long pOP_ID) {
			POP_ID = pOP_ID;
		}

		public String getCONN_STATUS() {
			return CONN_STATUS;
		}

		public void setCONN_STATUS(String cONN_STATUS) {
			CONN_STATUS = cONN_STATUS;
		}

		public Date getCONN_EXPIRY_DATE() {
			return CONN_EXPIRY_DATE;
		}

		public void setCONN_EXPIRY_DATE(Date cONN_EXPIRY_DATE) {
			CONN_EXPIRY_DATE = cONN_EXPIRY_DATE;
		}

		public Long getCATAGORY_ID() {
			return CATAGORY_ID;
		}

		public void setCATAGORY_ID(Long cATAGORY_ID) {
			CATAGORY_ID = cATAGORY_ID;
		}

		public String getIP() {
			return IP;
		}

		public void setIP(String iP) {
			IP = iP;
		}

		public Character getVERIFIED() {
			return VERIFIED;
		}

		public void setVERIFIED(Character vERIFIED) {
			VERIFIED = vERIFIED;
		}

		public String getWARD() {
			return WARD;
		}

		public void setWARD(String wARD) {
			WARD = wARD;
		}

		public String getAREA() {
			return AREA;
		}

		public void setAREA(String aREA) {
			AREA = aREA;
		}

		public Long getBILL_CYCLE() {
			return BILL_CYCLE;
		}

		public void setBILL_CYCLE(Long bILL_CYCLE) {
			BILL_CYCLE = bILL_CYCLE;
		}

		public Double getBILL() {
			return BILL;
		}

		public void setBILL(Double bILL) {
			BILL = bILL;
		}

		public Double getINST_CHARGE() {
			return INST_CHARGE;
		}

		public void setINST_CHARGE(Double iNST_CHARGE) {
			INST_CHARGE = iNST_CHARGE;
		}

		public Double getCONNECTION_FEE() {
			return CONNECTION_FEE;
		}

		public void setCONNECTION_FEE(Double cONNECTION_FEE) {
			CONNECTION_FEE = cONNECTION_FEE;
		}

		public Double getCOMISSION() {
			return COMISSION;
		}

		public void setCOMISSION(Double cOMISSION) {
			COMISSION = cOMISSION;
		}

		public Double getVAT() {
			return VAT;
		}

		public void setVAT(Double vAT) {
			VAT = vAT;
		}

		public Double getINST_CHARGE_COMISSION() {
			return INST_CHARGE_COMISSION;
		}

		public void setINST_CHARGE_COMISSION(Double iNST_CHARGE_COMISSION) {
			INST_CHARGE_COMISSION = iNST_CHARGE_COMISSION;
		}

		public Double getRECIEVED_AMT() {
			return RECIEVED_AMT;
		}

		public void setRECIEVED_AMT(Double rECIEVED_AMT) {
			RECIEVED_AMT = rECIEVED_AMT;
		}

		public Double getACCID() {
			return ACCID;
		}

		public void setACCID(Double aCCID) {
			ACCID = aCCID;
		}

		public Date getCONN_CREATIONDATE() {
			return CONN_CREATIONDATE;
		}

		public void setCONN_CREATIONDATE(Date cONN_CREATIONDATE) {
			CONN_CREATIONDATE = cONN_CREATIONDATE;
		}

		public Date getACTIVATION_DATE() {
			return ACTIVATION_DATE;
		}

		public void setACTIVATION_DATE(Date aCTIVATION_DATE) {
			ACTIVATION_DATE = aCTIVATION_DATE;
		}

		public Long getAREA_ID() {
			return AREA_ID;
		}

		public void setAREA_ID(Long aREA_ID) {
			AREA_ID = aREA_ID;
		}

		public Long getSOLD_BY() {
			return SOLD_BY;
		}

		public void setSOLD_BY(Long sOLD_BY) {
			SOLD_BY = sOLD_BY;
		}

		public Long getADDRESS_ID() {
			return ADDRESS_ID;
		}

		public void setADDRESS_ID(Long aDDRESS_ID) {
			ADDRESS_ID = aDDRESS_ID;
		}

		public String getREMARKS() {
			return REMARKS;
		}

		public void setREMARKS(String rEMARKS) {
			REMARKS = rEMARKS;
		}

		public Date getDATE_OF_BIRTH() {
			return DATE_OF_BIRTH;
		}

		public void setDATE_OF_BIRTH(Date dATE_OF_BIRTH) {
			DATE_OF_BIRTH = dATE_OF_BIRTH;
		}

		public Integer getBALANCE() {
			return BALANCE;
		}

		public void setBALANCE(Integer bALANCE) {
			BALANCE = bALANCE;
		}

		public String getIS_FRAC() {
			return IS_FRAC;
		}

		public void setIS_FRAC(String iS_FRAC) {
			IS_FRAC = iS_FRAC;
		}

		public String getIS_MOBILE_VERIFIED() {
			return IS_MOBILE_VERIFIED;
		}

		public void setIS_MOBILE_VERIFIED(String iS_MOBILE_VERIFIED) {
			IS_MOBILE_VERIFIED = iS_MOBILE_VERIFIED;
		}
		
		
}	
		
		
		