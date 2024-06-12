package com.telepacific.merrt.config;

public class MFMFeedHandlerStatus {


public int getMfmID() {
	return mfmID;
}
public void setMfmID(int mfmID) {
	this.mfmID = mfmID;
}
public int getFeedID() {
	return feedID;
}
public void setFeedID(int feedID) {
	this.feedID = feedID;
}
public boolean getIsRunning() {
	return isRunning;
}
public void setisRunning(boolean isRunning) {
	this.isRunning = isRunning;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getErrorCode() {
	return errorCode;
}
public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}

private int mfmID;
private int feedID;
private boolean isRunning;
private String status;
private String errorCode;

}
