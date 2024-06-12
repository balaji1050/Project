package com.telepacific.merrt.config;

import java.util.Date;


	public class FeedManagerJMXStatus {

		
	
		public int getFeedStatusId() {
			return feedStatusId;
		}
		public void setFeedStatusId(int feedStatusId) {
			this.feedStatusId = feedStatusId;
		}
		public int getFeedId() {
			return feedId;
		}
		public void setFeedId(int feedId) {
			this.feedId = feedId;
		}
		public String getFeedName() {
			return feedName;
		}
		public void setFeedName(String feedName) {
			this.feedName = feedName;
		}
		public String getFeedStatus() {
			return feedStatus;
		}
		public void setFeedStatus(String feedStatus) {
			this.feedStatus = feedStatus;
		}
		public String getServerLocation() {
			return serverLocation;
		}
		public void setServerLocation(String serverLocation) {
			this.serverLocation = serverLocation;
		}
		public String getFloderName() {
			return floderName;
		}
		public void setFloderName(String floderName) {
			this.floderName = floderName;
		}
		public String getThreadName() {
			return threadName;
		}
		public void setThreadName(String threadName) {
			this.threadName = threadName;
		}
		public int getQueuedFilesCount() {
			return queuedFilesCount;
		}
		public void setQueuedFilesCount(int queuedFilesCount) {
			this.queuedFilesCount = queuedFilesCount;
		}
		public Date getFeedFileDate() {
			return feedFileDate;
		}
		public void setFeedFileDate(Date feedFileDate) {
			this.feedFileDate = feedFileDate;
		}
		public String getThreadStatus() {
			return threadStatus;
		}
		public void setThreadStatus(String threadStatus) {
			this.threadStatus = threadStatus;
		}
		public int getThreadRunningMillisecs() {
			return threadRunningMillisecs;
		}
		public void setThreadRunningMillisecs(int threadRunningMillisecs) {
			this.threadRunningMillisecs = threadRunningMillisecs;
		}
		
		private int feedStatusId = 0;
	    private int feedId = 0;
	    private String feedName = null;
	    private String feedStatus = null;
	    private String serverLocation = null;
	    private String floderName = null;
	    private String threadName = null;     
	    private int queuedFilesCount = 0;
	    private Date feedFileDate = null;
	    private String threadStatus = null;
	    private int threadRunningMillisecs = 0;
			   
	}

