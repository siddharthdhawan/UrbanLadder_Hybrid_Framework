package uiStore;

import org.openqa.selenium.By;

public class HomeUi {
	
	public static By profileButton=By.xpath("//ul[@class='header__topBarIconList']/child::li[2]");
	public static By Login=By.xpath("//ul[@class='header__topBarIconList']/child::li[2]/descendant::li[1]");
	public static By loginMail=By.xpath("//form[@name='login_form']/descendant::input[@type='email']");
	public static By loginPw=By.xpath("//form[@name='login_form']/descendant::input[@type='password']");
	public static By loginSubmit=By.xpath("//form[@name='login_form']/descendant::input[@type='submit']");
	public static By myProfile=By.xpath("//ul[@class='header__topBarIconList']/child::li[2]/descendant::li[1]");
	public static By signUp=By.xpath("//ul[@class='header__topBarIconList']/child::li[2]/descendant::li[2]");
	public static By signUpMail=By.xpath("//form[@name='signup_form']/descendant::input[@type='email']");
	public static By signUpPw=By.xpath("//form[@name='signup_form']/descendant::input[@type='password']");
	public static By signUpSubmit=By.xpath("//form[@name='signup_form']/descendant::input[@type='submit']");
	public static By errorSignUpMail=By.xpath("//label[@for='spree_user_email']");
	public static By searchBox=By.xpath("//input[@id='search']");
	public static By searchButton=By.xpath("//button[@id='search_button']");
	public static By stores=By.xpath("//a[@href='../../furniture-stores?src=header']");
	public static By subscribeInputBox=By.xpath("//input[@id='email_id']");
	public static By submitSubscribe=By.xpath("//input[@value='SUBSCRIBE']");
	public static By subscribedMsg=By.xpath("//div[@class='success-msg']/descendant::div");
	public static By contactUs=By.xpath("//a[@href='/help/contact-us?src=g_footer']");
	public static By warrantyReturnRefund=By.xpath("//a[@href='/terms-of-offer-for-sale?src=g_footer']");
	
}
