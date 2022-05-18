package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.MyProfileUi;
import utility.Logs;

public class MyProfilePage {

	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public MyProfilePage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public String getMail() {
		helper.explicitWaitForInvisibilty(MyProfileUi.email, 20);
		String text=helper.getText(MyProfileUi.email);
		log.info("Getting Mail from my profile page");
		return text;
	}
	
}
