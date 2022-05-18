package utility;



import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports_ {
	
	ConfigRead cr = new ConfigRead();
	public ExtentReports reports;
	public ExtentTest test;
	
	public void creatReport() {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyy/HH/mm/ss");
		String date=sdf.format(d);
		String timestamp="./Reports/"+date.replaceAll("/", "_")+"-"+cr.reportName()+".html";
		reports=new ExtentReports(timestamp,true);
	}
	public ExtentTest createTest(String testname) {
		test=reports.startTest(testname);
		test.assignAuthor(cr.author());
		return test;
	}
	
	public void logPass(String text) {
		test.log(LogStatus.PASS, text);
	}
	public void logFail(String text) {
		test.log(LogStatus.FAIL, text);
	}
	
	public void closeTest() {
		reports.endTest(test);
	}
	public void closeReport() {
		reports.flush();
		reports.close();
	}
}
