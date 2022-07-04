package com.enter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enter_page {
	
		
		public static WebDriver driver;
		
		@FindBy (xpath = "//span[contains(text(),'Add to cart')]")
				private WebElement  Add;
		
		public Enter_page(WebDriver driver2) {
			
			this.driver = driver2;
			 PageFactory.initElements(driver2, this);
		}

		public static WebDriver getDriver() {
			return driver;
			
		}

		public WebElement getAdd() {
			return Add;
		}

		public WebElement getProceed() {
			return proceed;
		}

		public WebElement getBtn() {
			return btn;
		}

		public WebElement getBtn1() {
			return btn1;
		}

		public WebElement getBtn2() {
			return btn2;
		}

		public WebElement getCheckb() {
			return checkb;
		}

		public WebElement getBtn3() {
			return btn3;
		}

		@FindBy (xpath = "//div[@id='page']/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
		private WebElement  proceed;
		
		@FindBy (xpath = "//div[@id='page']/div[2]/div/div[3]/div/p[2]/a[1]/span")
		private WebElement  btn;
		
		@FindBy (xpath = "//div[@id='page']/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
		private WebElement  btn1 ;
		
		@FindBy (xpath = "//div[@id='page']/div[2]/div/div[3]/div/form/p/button/span")
		private WebElement btn2  ;
		
		@FindBy (xpath = "//input[@type='checkbox']")
		private WebElement checkb  ;
		
		@FindBy (xpath = "//div[@id='page']/div[2]/div/div[3]/div/div/form/p/button/span")
		private WebElement btn3  ;
		
		//Home page 
		
		
		@FindBy (xpath = "(//span[text()='Add to cart'])[2]")
		private WebElement  hadd;
		
		public WebElement getHadd() {
			return hadd;
		}

		public WebElement getHproceed() {
			return hproceed;
		}

		public WebElement getHproceed1() {
			return hproceed1;
		}

		public WebElement gethSignin() {
			return hSignin;
		}

		public WebElement getHproceed2() {
			return hproceed2;
		}

		public WebElement getRadiobtn() {
			return Radiobtn;
		}

		public WebElement getHproceed3() {
			return hproceed3;
		}

		@FindBy (xpath = "//span[contains(text(),'Proceed to checkout')]")
		private WebElement  hproceed;
		
		
		@FindBy (xpath = "(//span[contains(text(),'Proceed to checkout')])[1]")
		private WebElement  hproceed1;
		

		@FindBy (xpath = "//i[@class='icon-lock left']")
		private WebElement  hSignin;
		
		
		@FindBy (xpath = "//span[text()='Proceed to checkout']")
		private WebElement  hproceed2;
		
		@FindBy (xpath = "//input[@type='checkbox']")
		private WebElement  Radiobtn;
		
		
		@FindBy (xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
		private WebElement  hproceed3;
		
		@FindBy (xpath = "//a[@class='logout']")
		private WebElement  Signout;
		
		
		
		
		//Dresses 
		
		
		@FindBy (xpath = "(//span[text()='Add to cart'])[1]")
		private WebElement  Dadd;
		
		public WebElement getSignout() {
			return Signout;
		}

		public WebElement getDadd() {
			return Dadd;
		}

		public WebElement getDProceed() {
			return DProceed;
		}

		public WebElement getDProceed1() {
			return DProceed1;
		}

		public WebElement getDsignin() {
			return Dsignin;
		}

		public WebElement getDproceed2() {
			return Dproceed2;
		}

		public WebElement getDradio() {
			return Dradio;
		}

		public WebElement getDproceed3() {
			return Dproceed3;
		}

		@FindBy (xpath = "//span[contains(text(),'Proceed to checkout')]")
		private WebElement  DProceed;
		
		
		@FindBy (xpath = "//span[text()='Proceed to checkout']")
		private WebElement  DProceed1;
		
		@FindBy (xpath = "//i[@class='icon-lock left']")
		private WebElement  Dsignin;
		
		@FindBy (xpath = "(//span[text()='Proceed to checkout'])")
		private WebElement  Dproceed2;
		
		@FindBy (xpath = "//input[@type='checkbox']")
		private WebElement  Dradio;
		
		@FindBy (xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
		private WebElement  Dproceed3;
		
		
		
	}



