package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.CartPage;
import pageObject.ContactUsPage;
import pageObject.ErrorLoginPage;
import pageObject.HomePage;
import pageObject.MyProfilePage;
import pageObject.SearchPage;
import pageObject.StorePage;
import pageObject.WarrantyReturnPage;
import pageObject.WishlistPage;
import utility.BaseClass;
import utility.ConfigRead;
import utility.ExtentReports_;
import utility.ReadExcel;
import utility.SnapShots;

public class TestExecution extends BaseClass {
	
	BaseClass baseclass;
	ConfigRead cr;
	HomePage homepage;
	MyProfilePage myprofilepage;
	ErrorLoginPage errorloginpage;
	SearchPage searchpage;
	WishlistPage wishlistpage;
	CartPage cartpage;
	StorePage storepage;
	ContactUsPage contactuspage;
	WarrantyReturnPage warrantyreturnpage;
	ReadExcel readexcel;
	ExtentReports_ reports;
	SnapShots snap;
	
	@BeforeClass
	public void beforeClass() {
		reports=new ExtentReports_();
		reports.creatReport();
		reports.createTest("UrbanLadder test");
	}
	@BeforeMethod
	public void before() {
		baseclass=new BaseClass();
		baseclass.setup();
		driver.get(url);
		cr=new ConfigRead();
		homepage=new HomePage();
		myprofilepage=new MyProfilePage();
		errorloginpage=new ErrorLoginPage();
		searchpage=new SearchPage();
		wishlistpage=new WishlistPage();
		cartpage=new CartPage();
		storepage=new StorePage();
		contactuspage=new ContactUsPage();
		warrantyreturnpage=new WarrantyReturnPage();
		readexcel=new ReadExcel();
		snap=new SnapShots();
		reports.logPass("browser opened successfully");
		
	}
	
	@Test(priority=1)
	public void t1() throws InterruptedException, IOException {
		homepage.clickOnProfile();
		Thread.sleep(2000);
		homepage.clickOnLogin();;
		Thread.sleep(2000);
		String mailId=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 0);
		homepage.typeLoginMail(mailId);
		Thread.sleep(2000);
		String password=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 1);
		homepage.typeLoginPw(password);
		Thread.sleep(2000);
		homepage.submitLogin();;
		Thread.sleep(2000);
		homepage.clickOnProfile();
		Thread.sleep(2000);
		homepage.clickOnMyProfile();
		Thread.sleep(2000);
		String mail=myprofilepage.getMail();
		if(mailId.equalsIgnoreCase(mail)) {
			reports.logPass("Test 1 passed");
			snap.takeSnapShot("Test 1 passed");
		} else {
			reports.logFail("Test 1 failed");
			snap.takeSnapShot("Test 1 failed");
		}
	}
	
	@Test(priority=2)
	public void t2() throws InterruptedException, IOException {
		homepage.clickOnProfile();
		Thread.sleep(2000);
		homepage.clickOnLogin();;
		Thread.sleep(2000);
		String mailId=ReadExcel.getValidStringData(cr.Excel2Filepath(), 1, 0);
		homepage.typeLoginMail(mailId);
		Thread.sleep(2000);
		String password=ReadExcel.getValidStringData(cr.Excel2Filepath(), 1, 1);
		homepage.typeLoginPw(password);
		Thread.sleep(2000);
		homepage.submitLogin();;
		Thread.sleep(2000);
		String msg=errorloginpage.getErrorMsg();
		if(msg.contains("incorrect")) {
			reports.logPass("Test 2 passed");
			snap.takeSnapShot("Test 2 passed");
			} else {
				reports.logFail("Test 2 failed");
				snap.takeSnapShot("Test 2 failed");
			}
	}
	
	@Test(priority=3)
	public void t3() throws InterruptedException, IOException {
		homepage.clickOnProfile();
		Thread.sleep(2000);
		homepage.clickOnSignUp();
		Thread.sleep(2000);
		String mail=ReadExcel.getValidStringData(cr.Excel3Filepath(), 1, 0);
		homepage.typeSignUpMail(mail);
		Thread.sleep(2000);
		String password=ReadExcel.getValidStringData(cr.Excel3Filepath(), 1, 1);
		homepage.typeSignUpPw(password);
		String text1=homepage.getErrorSignUpMail();
		homepage.submitSignUp();
		if(text1.equalsIgnoreCase("please enter a valid email address.") ) {
			reports.logPass("Test 3 passed");
			snap.takeSnapShot("Test 3 passed");
		} else {
			reports.logFail("Test 3 failed");
			snap.takeSnapShot("Test 3 failed");
		}
	}
	
	@Test(priority=4)
	public void t4() throws InterruptedException, IOException {
		String mailId=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 0);
		homepage.typeSubscribeMailId(mailId);
		Thread.sleep(2000);
		homepage.clickOnSubscribe();
		Thread.sleep(2000);
		String msg=homepage.getSubscribedMsg();
		if(msg.equalsIgnoreCase("Thanks for subscribing!")) {
			reports.logPass("Test 4 passed");
			snap.takeSnapShot("Test 4 passed");
		} else {
			reports.logFail("Test 4 failed");
			snap.takeSnapShot("Test 4 failed");
		}
	}
	@Test(priority=5)
	public void t5() throws InterruptedException, IOException {
		homepage.clickOnProfile();
		Thread.sleep(2000);
		homepage.clickOnLogin();;
		Thread.sleep(2000);
		String mailId=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 0);
		homepage.typeLoginMail(mailId);
		Thread.sleep(2000);
		String password=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 1);
		homepage.typeLoginPw(password);
		Thread.sleep(2000);
		homepage.submitLogin();;
		Thread.sleep(2000);
		homepage.typeSearch("sofa");
		Thread.sleep(2000);
		homepage.clickOnSearch();
		Thread.sleep(2000);
		searchpage.clickOnResult1();
		Thread.sleep(2000);
		searchpage.clickOnWhishlist();
		Thread.sleep(2000);
		searchpage.clickOnCheckWhishlist();
		Thread.sleep(2000);
		String item=wishlistpage.getItemName();
		if(item.contains("Sofa")) {
			reports.logPass("Test 5 passed");
			snap.takeSnapShot("Test 5 passed");
		} else {
			reports.logFail("Test 5 failed");
			snap.takeSnapShot("Test 5 failed");
		}
	}
	
	@Test(priority=6)
	public void t6() throws InterruptedException, IOException {
		homepage.clickOnProfile();
		Thread.sleep(2000);
		homepage.clickOnLogin();;
		Thread.sleep(2000);
		String mailId=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 0);
		homepage.typeLoginMail(mailId);
		Thread.sleep(2000);
		String password=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 1);
		homepage.typeLoginPw(password);
		Thread.sleep(2000);
		homepage.submitLogin();;
		Thread.sleep(2000);
		homepage.typeSearch("sofa");
		Thread.sleep(2000);
		homepage.clickOnSearch();
		Thread.sleep(2000);
		searchpage.clickOnResult1();
		Thread.sleep(2000);
		searchpage.clickOnAddToCart();
		Thread.sleep(2000);
		String cartItem=cartpage.getCartItem();
		if(cartItem.contains("Sofa")) {
			reports.logPass("Test 6 passed");
			snap.takeSnapShot("Test 6 passed");
		} else {
			reports.logFail("Test 6 failed");
			snap.takeSnapShot("Test 6 failed");
		}	
	}
	
	@Test(priority=7)
	public void t7() throws InterruptedException {
		homepage.typeSearch("sofa");
		Thread.sleep(2000);
		homepage.clickOnSearch();
		Thread.sleep(2000);
		searchpage.clickOnResult1();
		Thread.sleep(2000);
		searchpage.closePop();
		Thread.sleep(2000);
		searchpage.clickOnEmiKnowMore();
		Thread.sleep(2000);
		String head=searchpage.getEmiOptionHeading();
		if(head.equalsIgnoreCase("Easy Finance Options")) {
			reports.logPass("Test 7 passed");
			snap.takeSnapShot("Test 7 passed");
		} else {
			reports.logFail("Test 7 failed");
			snap.takeSnapShot("Test 7 failed");
		}	
	}
	
	@Test(priority=8)
	public void t8() throws InterruptedException {
	homepage.clickOnStores();
	storepage.clickOnDelhiStore();
	String store=storepage.getStoreLocation();
	if(store.contains("Delhi")) {
		reports.logPass("Test 8 passed");
		snap.takeSnapShot("Test 8 passed");
	} else {
		reports.logFail("Test 8 failed");
		snap.takeSnapShot("Test 8 failed");
	}
	
}
	
	@Test(priority=9)
	public void t9() throws InterruptedException {
		homepage.clickOnContactUs();
		Thread.sleep(2000);
		String title=contactuspage.getTitle();
		if(title.equalsIgnoreCase("contact us")) {
			reports.logPass("Test 9 passed");
			snap.takeSnapShot("Test 9 passed");
		} else {
			reports.logFail("Test 9 failed");
			snap.takeSnapShot("Test 9 failed");
		}
	}
	
	@Test(priority=10)
	public void t10() throws InterruptedException {
		homepage.clickOnWarrantyReturnRefund();
		Thread.sleep(2000);
		String warranty=warrantyreturnpage.getTitleWarrantyPolicy();
		String refund=warrantyreturnpage.getTitleReturnRefundPolicy();
		if(warranty.equalsIgnoreCase("warranty policy") && refund.contains("RETURN AND REFUND")) {
			reports.logPass("Test 10 passed");
			snap.takeSnapShot("Test 10 passed");
		} else {
			reports.logFail("Test 10 failed");
			snap.takeSnapShot("Test 10 failed");
		}
	}
	
	
	@AfterMethod
	public void after() {
		baseclass.teardown();
		reports.logPass("browser terminatted successfully");
	}
	
	@AfterClass
	public void afterClass() {
		reports.closeTest();
		reports.closeReport();
	}
}
