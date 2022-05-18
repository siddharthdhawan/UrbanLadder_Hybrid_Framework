package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.CartUi;
import utility.Logs;

public class CartPage {

	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public CartPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public String getCartItem() {
		helper.explicitWaitForInvisibilty(CartUi.itemName, 20);
		String text=helper.getText(CartUi.itemName);
		log.info("Getting item name from the cart page");
		return text;
	}
}
