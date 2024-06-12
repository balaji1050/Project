/**
 * <p>Title: UDashProps</p>
 * <p>Description:</p>
 * @author Bradley Gude
 * @version 1.0
 */

package com.telepacific.merrt.config;

import java.io.File;
import java.net.URL;
import java.util.Properties;

import com.telepacific.merrt.config.UDashProps;

public class UDashProps {

    private static UDashProps instance = null;
    public static UDashProps getInstance() {
    	
	        if (instance==null) {
	            instance = new UDashProps();
	        }
        return instance;
    }

    public  String jdbc = null;
    public  File archiveRoot = null;

    public boolean isRemote = false;
    private boolean loaded = false; 

    private UDashProps() {
    	
    	try{
    		 URL root = getClass().getProtectionDomain().getCodeSource().getLocation();
    		 URL propertiesFile = new URL(root, "mfmproperties.properties"); 
    		 
			 Properties mfmProperties = new Properties();
			//FileInputStream in = new FileInputStream("src\\mfmproperties.properties");     
			mfmProperties.load(propertiesFile.openStream());	 
	        this.setArchiveRoot(new File (mfmProperties.getProperty("archiveroot").trim()));
	        this.setJDBC(mfmProperties.getProperty("jdbc").trim());
	        
    	}catch(Exception e){
    		e.printStackTrace();
    	}

    }

    public File getArchiveRoot() {
        return archiveRoot;
    }

    public void setArchiveRoot(File archiveRoot) {
        this.archiveRoot = archiveRoot;
    }

    public String getJDBC() {
        return jdbc;
    }

    public void setJDBC(String jdbc) {
        this.jdbc = jdbc;
    }


    public boolean isRemote() {
        return true;
    }

    public void setRemote(boolean remote) {
        isRemote = remote;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }
}
