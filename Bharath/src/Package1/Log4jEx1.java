package Package1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
public class Log4jEx1 {
	Logger log=LogManager.getLogger(Log4jEx1.class);

	@Test
	public void logs()
	{
			
			log.info("-----------------New Testcvase----------------------");
			log.trace("It is trace message");
			log.debug("Application is opened");
			log.info("Page is opened");
			log.warn("It is warning message");
			log.error("It is error message");
			log.fatal("Fatal Message");
			

	}
		

}
