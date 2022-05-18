package uiStore;

import org.openqa.selenium.By;

public class SearchUi {
	
	public static By result1=By.xpath("//ul[@class='productlist small-block-grid-3']/child::li[1]/descendant::a[2]");
	public static By addWishlist=By.xpath("//div[@id='product-title']/descendant::span[1]");
	public static By checkWishlist=By.xpath("//ul[@class='header__topBarIconList']/child::li[3]");
	public static By addToCart=By.xpath("//button[@id='add-to-cart-button']");
	public static By knowMoreEmi=By.xpath("//ul[@class='emi-offers']/descendant::a");
	public static By emiHeading=By.xpath("//div[@id='applicable-emis']/descendant::div[3]");
	public static By closePop=By.xpath("//a[@data-gaaction='popup.auth.close']");
}
