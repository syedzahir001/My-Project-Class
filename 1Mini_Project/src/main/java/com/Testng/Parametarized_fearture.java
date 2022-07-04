package com.Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametarized_fearture {
	
	@Test
	@Parameters({"username","password"})
	
	private void Credentials(String username, String password ) {
	
		System.out.println("username :" +username );
		System.out.println("password :" +password );
	}

}
