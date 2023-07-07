package Test;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.*;

public class test {

	final static Logger logger = LogManager.getLogger(test.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.error("에러 로그!");
		logger.info("인포 로그!");
	}

}
