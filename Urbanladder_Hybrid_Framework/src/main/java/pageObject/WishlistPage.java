package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.WishlistUi;
import utility.Logs;

public class WishlistPage {

	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public WishlistPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public String getItemName() {
		helper.explicitWaitForInvisibilty(WishlistUi.item, 20);
		String text=helper.getText(WishlistUi.item);
		log.info("Getting Name of the item from wishlistpage");
		return text;
	}
}
