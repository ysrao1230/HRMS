package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo {
	
	static Logger logger = LogManager.getLogger(Log4jdemo.class);

	public static void main(String[] args) {
		logger.info("this is info message");
		logger.error("this is error message");
		logger.warn("this is warn message");
		logger.fatal("this is fatal message");
	}

}
