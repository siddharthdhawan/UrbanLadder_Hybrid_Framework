package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.ErrorLoginUi;
import utility.Logs;

public class ErrorLoginPage {

	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public ErrorLoginPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public String getErrorMsg() {
		helper.explicitWaitForInvisibilty(ErrorLoginUi.error, 20);
		String text=helper.getText(ErrorLoginUi.error);
		log.info("getting error message on login page");
		return text;
	}
}
