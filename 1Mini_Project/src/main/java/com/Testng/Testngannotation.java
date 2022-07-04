package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngannotation {

	@BeforeClass
	private void login() {
		System.out.println("login");

	}

	@BeforeClass
	private void browserlaunch() {
		System.out.println("browsrl");

	}

	@BeforeMethod
	private void geturl() {
		System.out.println("url");

	}

	@Test
	private void womens() {
		System.out.println("Womens");

	}

	@Test

	private void men() {
		System.out.println("mens");
	}

	@AfterMethod

	private void logout() {
		System.out.println("logout");
	}

	@AfterClass

	private void close() {
		System.out.println("close");

	}

}
