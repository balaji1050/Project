	package com.telepacific.merrt.config;

	import com.telepacific.merrt.config.InitSessionFactory;
	import com.telepacific.merrt.config.FeedManager;
	import com.telepacific.merrt.config.MFMStatus;
	import com.telepacific.merrt.feedmanager.datafile.DataFilesStatus;
	import com.telepacific.merrt.config.UDashProps;
	
	import org.apache.log4j.Logger;
	import org.hibernate.Transaction;
	import org.hibernate.classic.Session;
	
import java.io.File;
	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.SQLException;
	import java.sql.Statement;
	import java.sql.ResultSet;
	import java.util.List;
	import java.util.Vector;
import java.util.ArrayList;
	
	public class MERRTFeedManagerDAO  {
	    	
		Logger log = Logger.getLogger(MERRTFeedManagerDAO.class);
		
		public List<MFMConfig> checkRegistration(String strIPAddress, int mfmID){
			
	        List <MFMConfig> feedManagerConfigList = new Vector<MFMConfig>();
	        try{
		        Transaction tx = null;
		        Session session = InitSessionFactory.getInstance().getCurrentSession();
		        tx = session.beginTransaction();
		        feedManagerConfigList = session.createQuery("select u from MFMConfig as u where MFM_Id = "+mfmID+" and Server_IPAddress = '"+strIPAddress+"'").list();
		
		        tx.commit();
	        } catch(Exception e){
	        	log.error(" checkRegistration "+e.toString());
	        }
	        return feedManagerConfigList;
		}
		
		
		public List <MFMConfig> getFeedIDListByServerIP(String strIPAddress){
			
	        List <MFMConfig> feedManagerConfigList = new Vector<MFMConfig>();
	        try{
		        Transaction tx = null;
		        Session session = InitSessionFactory.getInstance().getCurrentSession();
		        tx = session.beginTransaction();
		        feedManagerConfigList = session.createQuery("select u from MFMConfig as u where Server_IPAddress = '"+strIPAddress+"'").list();
		
		        tx.commit();
	        } catch(Exception e){
	        	log.error(" getFeedIDListByServerIP "+e.toString());
	        }
	        return feedManagerConfigList;
		}
		
		public ArrayList<Integer> getFeedIDListByMFMID(int iMFMId) throws SQLException{

	        ArrayList<Integer> feedIDList = new ArrayList<Integer>();
	    	Connection conn=null;
	    	ResultSet rs =null;
	    	Statement stmt=null;
	        try {
	        	
	        	conn= DriverManager.getConnection(UDashProps.getInstance().getJDBC());
	        	 stmt = conn.createStatement();
	        	 rs = stmt.executeQuery(" select data_feed_id from tbl_MFM_DATA_FEED_MAP where mfm_id="+iMFMId);
	        	while (rs.next()){
	        		feedIDList.add(rs.getInt(1));
	        	}	
	        } catch(Exception e){
	        	log.error(" getFeedIDListByMFMID "+e.toString());
	        }
	        finally
	        {
	        	if (rs!=null){rs.close();}
	        
	        	if(stmt!=null){stmt.close();}
	        
	        	if(conn!=null){conn.close();}
	        	
	        }
			return feedIDList;
		}

		public boolean isFeedhandlerStatusExist(int mfmID,int iFeedId) throws SQLException{

	        boolean isExisted = false;
	        Connection conn=null;
	    	ResultSet rs =null;
	    	Statement stmt=null;
	        
	        try {
	        	
	        	 conn = DriverManager.getConnection(UDashProps.getInstance().getJDBC());
	        	 stmt = conn.createStatement();
	        	 rs = stmt.executeQuery(" select count(feed_id) from tbl_MFM_FEED_HANDLER_STATUS where mfm_id = "+mfmID +" and feed_id="+iFeedId);
	        	rs.next();
	        	if(rs.getInt(1) == 1 ){
	        		isExisted = true;
	        	} else {
	        		isExisted = false;
	        	}
	        	
	        
	        	
	        } catch(Exception e){
	        	log.error(" getFeedIDListByMFMID "+e.toString());
	        }
	        finally
	        {
	        	if (rs!=null){ rs.close();}
	        
	        	if(stmt!=null){stmt.close();}
	        
	        	if(conn!=null){conn.close();}
	        	
	        }
			return isExisted;
		}

		public void setMFMStartupStatus(MFMStatus mfmStatus){

			try {
				
		        Transaction tx = null;
		        Session session = InitSessionFactory.getInstance().getCurrentSession();
		        tx = session.beginTransaction();
		        session.save(mfmStatus);
		        tx.commit();
		        
			}catch(Exception e){
				log.error(" setMFMStartupStatus "+e.toString());
			}
			
		}
		
		public void saveMFMFeedHandlerStatus(MFMFeedHandlerStatus mfmFeedHandlerStatus){
	       
			try {
				
		        Transaction tx = null;
		        Session session = InitSessionFactory.getInstance().getCurrentSession();
		        tx = session.beginTransaction();
		        session.save(mfmFeedHandlerStatus);
		        tx.commit();
		        
			}catch(Exception e){
				log.error(" setMFMFeedHandlerStatus "+e.toString());
			}
			
		}

		public void updateMFMFeedHandlerStatus(MFMFeedHandlerStatus mfmFeedHandlerStatus){
		       
			try {
				
		        Transaction tx = null;
		        Session session = InitSessionFactory.getInstance().getCurrentSession();
		        tx = session.beginTransaction();
		        session.update(mfmFeedHandlerStatus);
		        tx.commit();
		        
			}catch(Exception e){
				log.error(" setMFMFeedHandlerStatus "+e.toString());
			}
			
		}
		
		
		public void saveFeedFiles(DataFilesStatus dataFilesStatus){
					
			try {
				   
		        Transaction tx = null;
		        Session session = InitSessionFactory.getInstance().getCurrentSession();
		        tx = session.beginTransaction();
		        session.save(dataFilesStatus);
		        tx.commit();
			} catch(Exception e){
				log.error(" saveFeedFiles "+e.toString());
			}
	        
		}
		
		public void updateFeedFiles(DataFilesStatus dataFilesStatus){
			
			try {   
		        Transaction tx = null;
		        Session session = InitSessionFactory.getInstance().getCurrentSession();
		        tx = session.beginTransaction();
		        session.save(dataFilesStatus);
		        tx.commit();
			} catch(Exception e){
				log.error(" updateFeedFiles "+e.toString());
			}
			
		}
		
		public List<String> getCompletedFeedFilesListbyfilename(File file) throws SQLException {

			 List<String> feedfilesList = new ArrayList<String>();
		        Connection conn=null;
		    	ResultSet rs =null;
		    	Statement stmt=null;
		        try {
		        	
		        	 conn = DriverManager.getConnection(UDashProps.getInstance().getJDBC());
		        	 stmt = conn.createStatement();
		        	 rs = stmt.executeQuery("  select status from tbl_FEED_FILES_STATUS where  FILE_NAME = '"+file.getName()+"' and  status='completed' order by date_time desc");
		        	while (rs.next()){
		        		feedfilesList.add(rs.getString(1));
		        	}
		        
		        	
		        } catch(Exception e){
		        	log.error(" Error in getFeedIDListByFileName "+e.toString());
		        }
		        finally
      	        {
      	        	if (rs!=null){rs.close();}
      	        
      	        	if(stmt!=null){stmt.close();}
      	        
      	        	if(conn!=null){conn.close();}
      	        	
      	        }


			return feedfilesList;
		}		
		
		public List<String> getFeedFilesListbyfilename(File file) throws SQLException {

			 List<String> feedfilesList = new ArrayList<String>();
		        Connection conn=null;
		    	ResultSet rs =null;
		    	Statement stmt=null;
		        try {
		        	
		        	 conn = DriverManager.getConnection(UDashProps.getInstance().getJDBC());
		        	 stmt = conn.createStatement();
		        	 rs = stmt.executeQuery("  select status from tbl_FEED_FILES_STATUS where  FILE_NAME = '"+file.getName()+"' order by date_time desc");
		        	while (rs.next()){
		        		feedfilesList.add(rs.getString(1));
		        	}
		        
		        	
		        } catch(Exception e){
		        	log.error(" Error in getFeedIDListByFileName "+e.toString());
		        }
		        finally
       	        {
       	        	if (rs!=null){rs.close();}
       	        
       	        	if(stmt!=null){stmt.close();}
       	        
       	        	if(conn!=null){conn.close();}
       	        	
       	        }


			return feedfilesList;
		}
		
		public List<String> getFeedFilesList( int feedId) throws SQLException{

	        List<String> feedIDList = new ArrayList<String>();
	        Connection conn=null;
	    	ResultSet rs =null;
	    	Statement stmt=null;
	        try {
	        	
	        	 conn = DriverManager.getConnection(UDashProps.getInstance().getJDBC());
	        	 stmt = conn.createStatement();
	        	 rs = stmt.executeQuery("  select File_NAME from tbl_FEED_FILES_STATUS where status ='completed'and feed_id="+feedId);
	        	while (rs.next()){
	        		feedIDList.add(rs.getString(1));
	        	}
	        
	        	
	        } catch(Exception e){
	        	log.error(" Error in  getFeedIDList "+e.toString());
	        }



	        finally
	       	        {
	       	        	if (rs!=null){rs.close();}
	       	        
	       	        	if(stmt!=null){stmt.close();}
	       	        
	       	        	if(conn!=null){conn.close();}
	       	        	
	       	        }
			return feedIDList;
		}
		
		List <MFMConfig> feedManagerConfigList;
		FeedManager [] feedManagerList;
}
