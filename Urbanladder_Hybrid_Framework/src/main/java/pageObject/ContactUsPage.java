package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.ContactUsUi;
import utility.Logs;

public class ContactUsPage {

	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public ContactUsPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public String getTitle() {
		helper.explicitWaitForInvisibilty(ContactUsUi.title, 20);
		String text=helper.getText(ContactUsUi.title);
		log.info("Getting page title");
		return text;
	}
}
