package com.maestro.smilebdcp.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "PAYMENT")
public class PAYMENT {
	
	 @Id
	private Long ID;
	 

	@Column 
	private Double PAY_AMT ;
	@Column 
	private String  PAY_TYPE;
	
	@Column 
	private String REMARKS;
	@Column

	private Date PAY_DATE;
	
	
	@Column
	private String PHONENO;
	
	
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	
	public Double getPAY_AMT() {
		return PAY_AMT;
	}
	public void setPAY_AMT(Double pAY_AMT) {
		PAY_AMT = pAY_AMT;
	}
	public String getPAY_TYPE() {
		return PAY_TYPE;
	}
	public void setPAY_TYPE(String pAY_TYPE) {
		PAY_TYPE = pAY_TYPE;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	public Date getPAY_DATE() {
		return PAY_DATE;
	}
	public void setPAY_DATE(Date pAY_DATE) {
		PAY_DATE = pAY_DATE;
	}
	public String getPHONENO() {
		return PHONENO;
	}
	public void setPHONENO(String pHONENO) {
		PHONENO = pHONENO;
	}

	
	
}
