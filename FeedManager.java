package com.telepacific.merrt.config;

import java.util.Date;

	public class FeedManager {

		public String getFeedManagerName() {
			return feedManagerName;
		}
		public void setFeedManagerName(String feedManagerName) {
			this.feedManagerName = feedManagerName;
		}
		public String getServerIPAddress() {
			return serverIPAddress;
		}
		public void setServerIPAddress(String serverIPAddress) {
			this.serverIPAddress = serverIPAddress;
		}
		public int getJMXPORT() {
			return JMXPORT;
		}
		public void setJMXPORT(int jMXPORT) {
			JMXPORT = jMXPORT;
		}
		public int getFeedGroupId() {
			return feedGroupId;
		}
		public void setFeedGroupId(int feedGroupId) {
			this.feedGroupId = feedGroupId;
		}
		public int getFeedId() {
			return feedId;
		}
		public void setFeedId(int feedId) {
			this.feedId = feedId;
		}
		public boolean isIsDataBaseRemote() {
			return IsDataBaseRemote;
		}
		public void setIsDataBaseRemote(boolean isDataBaseRemote) {
			IsDataBaseRemote = isDataBaseRemote;
		}
		public Date getThreadStartDate() {
			return threadStartDate;
		}
		public void setThreadStartDate(Date threadStartDate) {
			this.threadStartDate = threadStartDate;
		}
		public Date getThreadEndDate() {
			return threadEndDate;
		}
		public void setThreadEndDate(Date threadEndDate) {
			this.threadEndDate = threadEndDate;
		}
		public int getUpTime() {
			return upTime;
		}
		public void setUpTime(int upTime) {
			this.upTime = upTime;
		}
		public boolean isIsContinous() {
			return IsContinous;
		}
		public void setIsContinous(boolean isContinous) {
			IsContinous = isContinous;
		}
		public boolean isIsThreadEnable() {
			return IsThreadEnable;
		}
		public void setIsThreadEnable(boolean isThreadEnable) {
			IsThreadEnable = isThreadEnable;
		}
		public String getFeedFolderPath() {
			return feedFolderPath;
		}
		public void setFeedFolderPath(String feedFolderPath) {
			this.feedFolderPath = feedFolderPath;
		}
		public String getDataBaseFeedFolderPath() {
			return dataBaseFeedFolderPath;
		}
		public void setDataBaseFeedFolderPath(String dataBaseFeedFolderPath) {
			this.dataBaseFeedFolderPath = dataBaseFeedFolderPath;
		}
		public String getCreatedUser() {
			return createdUser;
		}
		public void setCreatedUser(String createdUser) {
			this.createdUser = createdUser;
		}
		public String getCreatedIpaddress() {
			return createdIpaddress;
		}
		public void setCreatedIpaddress(String createdIpaddress) {
			this.createdIpaddress = createdIpaddress;
		}
		public Date getCreatedDatetime() {
			return createdDatetime;
		}
		public void setCreatedDatetime(Date createdDatetime) {
			this.createdDatetime = createdDatetime;
		}
		
		private String feedManagerName;
		private String 	serverIPAddress;
		private int 	JMXPORT;
		private int 	feedGroupId;
		private int 	feedId;
		private boolean	IsDataBaseRemote;
		private Date	threadStartDate;
		private Date	threadEndDate;
		private int 	upTime;
		private boolean	IsContinous;
		private boolean	IsThreadEnable;
		private String 	feedFolderPath;
		private String 	dataBaseFeedFolderPath;
		private String 	createdUser;
		private String 	createdIpaddress;
		private Date	createdDatetime;
	   
	}

