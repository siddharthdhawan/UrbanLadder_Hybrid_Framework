package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.StoresUi;
import utility.Logs;

public class StorePage {

	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public StorePage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public void clickOnDelhiStore() {
		helper.explicitWaitForInvisibilty(StoresUi.storeDelhi, 20);
		helper.clickOn(StoresUi.storeDelhi);
		log.info("Clicking on Delhi store");
	}
	
	public String getStoreLocation() {
		helper.explicitWaitForInvisibilty(StoresUi.location, 20);
		String text=helper.getText(StoresUi.location);
		log.info("Getting location of the store");
		return text;
	}
}

