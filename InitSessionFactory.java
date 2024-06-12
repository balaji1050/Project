/**
 * <p>Title: InitSessionFactory</p>
 * <p>Description:</p>
 * @author bgude
 * @version 1.0
 */

package com.telepacific.merrt.config;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.telepacific.merrt.config.InitSessionFactory;


public class InitSessionFactory {
	
	 static Logger log = Logger.getLogger(InitSessionFactory.class);
	 
    public InitSessionFactory() {
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
   			 session =sessionFactory.openSession();


    }

    public static String CONFIG_FILE_LOCATION = null;
    public static String jdbc = null;
    private static org.hibernate.SessionFactory sessionFactory;
    public static Session session = null;

    public static SessionFactory getInstance() {
        if (sessionFactory == null){
            initSessionFactory();
        }
        return sessionFactory;
    }

    public static Session openSession() {
        return sessionFactory.getCurrentSession();
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    private static synchronized void initSessionFactory() {

       
        if (sessionFactory == null) {

            try {
	           sessionFactory = new Configuration().configure().buildSessionFactory();
	         //  sessionFactory =sessionFactory.getCurrentSession();
	            

            } catch (Exception e) {
                log.error("%%%% Error Creating HibernateSessionFactory %%%%");
                //e.printStackTrace();
                throw new HibernateException(
                        "Could not initialize the Hibernate configuration");
            }
        }
    }

    public static void close() {
        if (sessionFactory != null)
            sessionFactory.close();
        sessionFactory = null;

    }
}
