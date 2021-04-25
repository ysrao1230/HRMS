package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo {
	
	static Logger logger = LogManager.getLogger(Log4jdemo.class);

	public static void main(String[] args) {
		logger.info("This is info message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		logger.debug("Testing");
	}

}
