package com.telepacific.merrt.config;

public class MERRTLog {
	
	
	private int logID;
	private int moduleID;
	private String moduleLocation;
	private String errorCodeID;
	
	
	public int getModuleID() {
		return moduleID;
	}
	public void setModuleID(int moduleID) {
		this.moduleID = moduleID;
	}
	public String getModuleLocation() {
		return moduleLocation;
	}
	public void setModuleLocation(String moduleLocation) {
		this.moduleLocation = moduleLocation;
	}
	public String getErrorCodeID() {
		return errorCodeID;
	}
	public void setErrorCodeID(String errorCodeID) {
		this.errorCodeID = errorCodeID;
	}
	public int getLogID() {
		return logID;
	}
	public void setLogID(int logID) {
		this.logID = logID;
	}
	
}
