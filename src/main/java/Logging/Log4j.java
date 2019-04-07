package Logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
	static Logger log = Logger.getLogger(Log4j.class);
	public static void main(String[] args) {
		//PropertiesConfigurator is used to configure logger from properties file
		//String path = System.getProperty("//Automation//src//main//java//Logging//log4j.properties");
        PropertyConfigurator.configure("C:\\Automation\\TestData\\log4j.properties");

        //log the message to file
        log.trace("This is a debug message");
        log.info("This is an info message");
	}
}