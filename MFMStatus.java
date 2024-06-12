package com.telepacific.merrt.config;

import java.util.Date;

public class MFMStatus 
{
	
	
	
	public int getMFMId() {
		return MFMId;
	}
	public void setMFMId(int mFMId) {
		MFMId = mFMId;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	private int MFMId;	
	private boolean status;
	private String errorCode;
	private Date dateTime;
	
}
