package com.coin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coins_name {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Mohamed Musthak Y\\\\eclipse-workspace\\\\Selenium\\\\drive\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.coingecko.com/en/exchanges/pancakeswap");

	
		driver.manage().window().maximize();
		
		List<WebElement> Table = driver.findElements(By.xpath("//a[@class='mr-1']"));

		for (WebElement alldata : Table) {
			String text = alldata.getText();

			System.out.println(text);
		}
		
	}

}
