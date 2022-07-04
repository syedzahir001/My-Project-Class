package com.Testng;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "Meta")
	private void Whatsapp() {
		System.out.println("Whatsapp");
	}

	@Test(groups = "Meta")
	private void facebook() {
		
		System.out.println("facebook");

	}

	@Test(groups =  "google")
	private void google() {
		System.out.println("google");
		
	}

	@Test(groups =  "google")
	private void googlemaps() {
		
		System.out.println("googlemaps");
		
	}
	
	@Test(groups =  "amazon")
	private void Amazon() {
		
		System.out.println("amazon");
		
	}
}
