package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.SearchUi;
import utility.Logs;

public class SearchPage {

	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public SearchPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public void clickOnResult1() {
		helper.explicitWaitForInvisibilty(SearchUi.result1, 20);
		helper.clickOn(SearchUi.result1);
		log.info("clicking on Product 1");
	}
	public void clickOnWhishlist() {
		helper.explicitWaitForInvisibilty(SearchUi.addWishlist, 20);
		helper.clickOn(SearchUi.addWishlist);
		log.info("Clicking on whishlist icon");
	}
	public void clickOnCheckWhishlist() {
		helper.explicitWaitForInvisibilty(SearchUi.checkWishlist, 20);
		helper.clickOn(SearchUi.checkWishlist);
		log.info("Clicking on check Whishlist");
	}
	public void clickOnAddToCart() {
		helper.explicitWaitForInvisibilty(SearchUi.addToCart, 20);
		helper.clickOn(SearchUi.addToCart);
		log.info("Clicking on add to cart");
	}
	public void clickOnEmiKnowMore() {
		helper.explicitWaitForInvisibilty(SearchUi.knowMoreEmi, 20);
		helper.clickOn(SearchUi.knowMoreEmi);
		log.info("Clicking on emi know more");
	}
	public void closePop() {
		helper.explicitWaitForInvisibilty(SearchUi.closePop, 20);
		helper.clickOn(SearchUi.closePop);
		log.info("Closing pop up");
	}
	public String getEmiOptionHeading() {
		helper.explicitWaitForInvisibilty(SearchUi.emiHeading, 20);
		String text=helper.getText(SearchUi.emiHeading);
		log.info("Getting getting heading of emi options");
		return text;
	}
}
