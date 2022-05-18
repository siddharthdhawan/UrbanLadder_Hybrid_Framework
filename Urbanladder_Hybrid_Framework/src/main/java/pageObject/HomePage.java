package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.HomeUi;
import utility.Logs;

public class HomePage {
	
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public HomePage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public void clickOnProfile() {
		helper.explicitWaitForInvisibilty(HomeUi.profileButton, 20);
		helper.clickOn(HomeUi.profileButton);
		log.info("Clicking on profile");
	}
	
	public void clickOnSignUp() {
		helper.explicitWaitForInvisibilty(HomeUi.signUp, 20);
		helper.clickOn(HomeUi.signUp);
		log.info("clicking on signup");
	}
	
	public void typeSignUpMail(String text) {
		helper.explicitWaitForInvisibilty(HomeUi.signUpMail, 20);
		helper.sendText(HomeUi.signUpMail, text);
		log.info("Typing sign up mail");
	}
	public void typeSignUpPw(String text) {
		helper.explicitWaitForInvisibilty(HomeUi.signUpPw, 20);
		helper.sendText(HomeUi.signUpPw, text);
		log.info("Typing sign up password");
	}
	public void submitSignUp() {
		helper.explicitWaitForInvisibilty(HomeUi.signUpSubmit, 20);
		helper.clickOn(HomeUi.signUpSubmit);
		log.info("Submitting signup details");
	}
	public void clickOnMyProfile() {
		helper.explicitWaitForInvisibilty(HomeUi.myProfile, 20);
		helper.clickOn(HomeUi.myProfile);
		log.info("Clicking on My Profie");
	}
	public String getErrorSignUpMail() {
		helper.explicitWaitForInvisibilty(HomeUi.errorSignUpMail, 20);
		String text=helper.getText(HomeUi.errorSignUpMail);
		log.info("getting error 1 from signup form");
		return text;
	}
	
	public void clickOnLogin() {
		helper.explicitWaitForInvisibilty(HomeUi.Login, 20);
		helper.clickOn(HomeUi.Login);
		log.info("Clicking on login");
	}
	
	public void typeLoginMail(String text) {
		helper.explicitWaitForInvisibilty(HomeUi.loginMail, 20);
		helper.sendText(HomeUi.loginMail, text);
		log.info("Typing login mail");
	}
	public void typeLoginPw(String text) {
		helper.explicitWaitForInvisibilty(HomeUi.loginPw, 20);
		helper.sendText(HomeUi.loginPw, text);
		log.info("Typing login password");
	}
	public void submitLogin() {
		helper.explicitWaitForInvisibilty(HomeUi.loginSubmit, 20);
		helper.clickOn(HomeUi.loginSubmit);
		log.info("Submitting login details");
	}
	
	public void typeSearch(String text) {
		helper.explicitWaitForInvisibilty(HomeUi.searchBox, 20);
		helper.sendText(HomeUi.searchBox, text);
		log.info("Typing in search box");
	}
	public void clickOnSearch( ) {
		helper.explicitWaitForInvisibilty(HomeUi.searchButton, 20);
		helper.clickOn(HomeUi.searchButton);
		log.info("clicking on search button");
	}
	
	public void typeSubscribeMailId(String text) {
		helper.explicitWaitForInvisibilty(HomeUi.subscribeInputBox, 20);
		helper.sendText(HomeUi.subscribeInputBox, text);
		log.info("typing mail for subscribing for altest offers");
	}
	
	public void clickOnSubscribe() {
		helper.explicitWaitForInvisibilty(HomeUi.submitSubscribe, 20);
		helper.clickOn(HomeUi.submitSubscribe);
		log.info("clicking on subscribe");
	}
	
	public String getSubscribedMsg() {
		helper.explicitWaitForInvisibilty(HomeUi.subscribedMsg, 20);
		String text=helper.getText(HomeUi.subscribedMsg);
		log.info("getting message for successfully subscribed");
		return text;
	}
	
	public void clickOnStores() {
		helper.explicitWaitForInvisibilty(HomeUi.stores, 20);
		helper.clickOn(HomeUi.stores);
		log.info("clicking on store button");
	}
	
	public void clickOnContactUs() {
		helper.explicitWaitForInvisibilty(HomeUi.contactUs, 20);
		helper.clickOn(HomeUi.contactUs);
		log.info("Clicking On ContactUs");
	}
	public void clickOnWarrantyReturnRefund() {
		helper.explicitWaitForInvisibilty(HomeUi.warrantyReturnRefund, 20);
		helper.clickOn(HomeUi.warrantyReturnRefund);
		log.info("Clicking on warranty,return and refund");
	}
}
