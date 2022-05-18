package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.WarrantyReturnUi;
import utility.Logs;

public class WarrantyReturnPage {

	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public WarrantyReturnPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public String getTitleWarrantyPolicy() {
		helper.explicitWaitForInvisibilty(WarrantyReturnUi.title1, 20);
		String text=helper.getText(WarrantyReturnUi.title1);
		log.info("Getting title for warranty policy");
		return text;
	}
	public String getTitleReturnRefundPolicy() {
		helper.explicitWaitForInvisibilty(WarrantyReturnUi.title2, 20);
		String text=helper.getText(WarrantyReturnUi.title2);
		log.info("Getting title for Return and refund policy");
		return text;
	}
}
