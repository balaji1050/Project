package com.telepacific.merrt.config;

public class MFMConfig {

	
	public String getMFMName() {
		return MFMName;
	}
	public void setMFMName(String mFMName) {
		MFMName = mFMName;
	}
	public int getMFMId() {
		return MFMId;
	}
	public void setMFMId(int mFMId) {
		MFMId = mFMId;
	}
	public String getServerIPAddress() {
		return serverIPAddress;
	}
	public void setServerIPAddress(String serverIPAddress) {
		this.serverIPAddress = serverIPAddress;
	}
	public int getJMXPort() {
		return JMXPort;
	}
	public void setJMXPort(int jMXPort) {
		JMXPort = jMXPort;
	}
	public boolean getIsMFMEnable() {
		return isMFMEnable;
	}
	public void setIsMFMEnable(boolean isMFMEnable) {
		this.isMFMEnable = isMFMEnable;
	}
	private String MFMName;
	private int MFMId;
	private String serverIPAddress;
	private int JMXPort;
	private boolean isMFMEnable;
}
