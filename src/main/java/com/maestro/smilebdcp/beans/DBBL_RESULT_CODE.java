package com.maestro.smilebdcp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DBBL_RESULT_CODE")
public class DBBL_RESULT_CODE {
	
	
	
    @Id
	private String RESULT_CODE;
	@Column
	private String RESULT_TYPE;
	@Column
	private String RESULT_DESC;
	
	
	public String getRESULT_CODE() {
		return RESULT_CODE;
	}
	public void setRESULT_CODE(String rESULT_CODE) {
		RESULT_CODE = rESULT_CODE;
	}
	public String getRESULT_TYPE() {
		return RESULT_TYPE;
	}
	public void setRESULT_TYPE(String rESULT_TYPE) {
		RESULT_TYPE = rESULT_TYPE;
	}
	public String getRESULT_DESC() {
		return RESULT_DESC;
	}
	public void setRESULT_DESC(String rESULT_DESC) {
		RESULT_DESC = rESULT_DESC;
	}
	
	

	
	
	

}
