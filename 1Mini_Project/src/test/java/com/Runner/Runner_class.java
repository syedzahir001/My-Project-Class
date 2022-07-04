package com.Runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Base.Base_Class;
import com.pomanager.Page_Objectmanager;

public class Runner_class extends Base_Class{
public static WebDriver driver = getbrowser("chrome");
	

	public static Page_Objectmanager pom = new Page_Objectmanager(driver);
	
	//public static Logger log = Logger.getLogger(Runner_class.class);

	public static void main(String[] args) throws InterruptedException, IOException {
		
	PropertyConfigurator.configure("log4j.properties");

//		Enter_page ep = new Enter_page(driver);
//
//		Signin_page si = new Signin_page(driver);
	
	
	//log.info("Browser lunch");
                                                         
		geturl("http://automationpractice.com/index.php?id_category=5&controller=category");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getAdd());

		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getProceed());
		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getBtn());

		Thread.sleep(2000);

		sendkeys(pom.getinstancesignin().getEmail(), "nileg46187@latovic.com");

		sendkeys(pom.getinstancesignin().getPsd(), "nileg46187");

		Clickelement(pom.getinstanceHp().getBtn1());
		
		//log.info("user signin");
		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getBtn2());
		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getCheckb());

		Clickelement(pom.getinstanceHp().getBtn3());
		
		
		
		//Home page 
		
		Clickelement(pom.getinstanceHp().getHadd());
		
		
		Clickelement(pom.getinstanceHp().getHproceed());
		
		
		Clickelement(pom.getinstanceHp().getHproceed1());
		
		sendkeys(pom.getinstancesignin().getHemail(), "nileg46187@latovic.com");
		
		sendkeys(pom.getinstancesignin().getHpassword(), "nileg46187");
		
		Clickelement(pom.getinstanceHp().gethSignin());
		
		Clickelement(pom.getinstanceHp().getHproceed2());
		
		Clickelement(pom.getinstanceHp().getRadiobtn());

		Clickelement(pom.getinstanceHp().getHproceed3());
		
		Clickelement(pom.getinstanceHp().gethSignin());
		
		//Dresses
		
		
		Clickelement(pom.getinstanceHp().getDadd());
		
		Clickelement(pom.getinstanceHp().getDProceed());
		
		Clickelement(pom.getinstanceHp().getDProceed1());
		
		sendkeys(pom.getinstancesignin().getDemail(), "nileg46187@latovic.com");
		
		sendkeys(pom.getinstancesignin().getDpsd(), "nileg46187");
		
		Clickelement(pom.getinstanceHp().getDsignin());
		
		Clickelement(pom.getinstanceHp().getDproceed2());
		
		Clickelement(pom.getinstanceHp().getDradio());
		
		Clickelement(pom.getinstanceHp().getDproceed3());
		
		
		
		
		//log.info("DRESS Booked");

//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//
//		File dest = new File("C:\\Users\\home\\eclipse-workspace\\Selenium\\Screenshoot\\payment.png");
//
//		FileUtils.copyFile(screenshotAs, dest);
		

	}

}


