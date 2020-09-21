package com.helloworld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        String message="Hello World";
    	LOG.debug(message+ " Will be printed on debug");
    	LOG.info(message+ " Will be printed on info");
    	LOG.warn(message+ " Will be printed on warn");
    	LOG.error(message+ " Will be printed on error");
    	
    	
    	
        
    }
}
