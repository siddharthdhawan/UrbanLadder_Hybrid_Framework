package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	ConfigRead cr=new ConfigRead();
	public String url=cr.getURL();
	public static WebDriver driver;
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", cr.driverPath());
		driver=new ChromeDriver();
		driver.get(cr.getURL());
		driver.manage().window().maximize();
	}
	
	public void teardown() {
		driver.close();
	}
}
