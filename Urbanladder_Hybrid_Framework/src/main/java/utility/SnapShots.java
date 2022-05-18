package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class SnapShots {
	
	WebDriver driver=BaseClass.driver;
	
	public String takeSnapShot(String name) {
		TakesScreenshot scrnshot=(TakesScreenshot) driver;
		File src=scrnshot.getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyy/HH/mm/ss");
		String date=sdf.format(d);
		String timestamp="./ScreenShots/"+date.replaceAll("/", "_")+"-"+name+".png";
		File dest=new File(timestamp);
		try {
			FileUtils.copyFile(src, dest);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return timestamp;
		
	}
}
