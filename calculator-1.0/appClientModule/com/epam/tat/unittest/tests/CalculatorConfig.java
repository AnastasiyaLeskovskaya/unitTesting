package com.epam.tat.unittest.tests;

import com.beust.jcommander.Parameters;
import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.*;
import org.testng.annotations.*;

/**
 * Test Script: Pre- and postconditions for CalculatorTestSuite
 * 
 * @author Dzmitry Malchanau
 */

public class CalculatorConfig {
	private static Logger Logging = Logger.getLogger("InfoLogging");
	protected static Calculator calculator;
	protected static Timeout timeout;

	
	@BeforeSuite
	public void configSuite() {
		Logging.info("Starting suite execution");
	}

	
	@BeforeClass(groups = "config", description = "Method creates instance of testing object with type Calculator.", alwaysRun = true)
	public void configClass() {
		Logging.info("Class preconditions are being processed");
		calculator = new Calculator();
		timeout = new Timeout();
	}

	@BeforeMethod
	public void configMethod() {
		Logging.info("Method preconditions are being processed");
	}
	
	
	
	@AfterMethod
	public void tearDowmMethod(){
		Logging.info("Method preconditions are being reverted");
	}
	
	@AfterClass(groups = "config", description = "Method tears down instance of testing object with type Calculator.", alwaysRun = true)
	public void tearDowmClass(){
		Logging.info("Class preconditions are being reverted");
		calculator = null;
		timeout = null;
		
	}
	
	@AfterSuite
	public void tearDowmSuite(){
		Logging.info("Suite execution is completed");
	}
	
	public Date checkTime(){
		Date date=new Date(System.currentTimeMillis());
		return date;
		
	}
}
