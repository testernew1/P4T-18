package com.example.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.example.fw.ApplicationManager;

// This test suite should Run As 'TestNG Test'! (as a suite).
public class TestBase {

	protected ApplicationManager app;
	
	// Pre and post initialization classes
	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();

	}

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	}
}
