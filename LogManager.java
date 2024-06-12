	package com.telepacific.merrt.config;

	import com.telepacific.merrt.config.InitSessionFactory;
	import com.telepacific.merrt.config.MERRTLog;
	import org.hibernate.Transaction;
	import org.hibernate.classic.Session;

	
	public class LogManager {

		public void saveMerrtLog(MERRTLog merrtLog){

	        Transaction tx = null;
	        Session session = InitSessionFactory.getInstance().getCurrentSession();
	        tx = session.beginTransaction();
	        session.save(merrtLog);
	        tx.commit();			
		}
}
