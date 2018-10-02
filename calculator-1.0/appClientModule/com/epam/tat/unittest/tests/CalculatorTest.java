package com.epam.tat.unittest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.unittest.dataproviders.DataProviders;

/**
 * Test Script: Pre- and postconditions for CalculatorTestSuite
 * 
 * @author Dzmitry Malchanau
 */

public class CalculatorTest extends CalculatorConfig {
	
	//Positive scenarios:

	@Test(groups = "CalculatorMethods", dependsOnMethods = "testMultMethod",dataProviderClass = DataProviders.class, dataProvider = "DataProviderForSumMethod",  description = "Test sum method of Calculator class",alwaysRun = true)
	public  void testSumMethod(double a, double b, double expectedResult) {
		double result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedResult,
				"Invalid result of the operation, correct result: " + expectedResult);
	}

	@Test(groups = "CalculatorMethods", dataProviderClass = DataProviders.class, dataProvider = "DataProviderForMultMethod", description = "Test sum method of Calculator class", alwaysRun = true)
	public  void testMultMethod(double a, double b, double expectedResult) {
		double result = calculator.mult(a, b);
		Assert.assertEquals(result, expectedResult,
				"Invalid result of the operation, correct result: " + expectedResult);

	}
	
	
	@Test(groups = "CalculatorMethods1", dataProviderClass = DataProviders.class, dataProvider = "DataProviderForDivMethod", description = "Test div method of Calculator class", alwaysRun = true)
	public void testDivMethod(double a, double b, double expectedResult){
		double result = calculator.div(a, b);
		Assert.assertTrue(result == expectedResult,
		/*Assert.assertEquals(result, expectedResult*/
				"Invalid result of the operation, correct result: " + expectedResult);
	}
	
	@Test(groups = "CalculatorMethods", dataProviderClass = DataProviders.class, dataProvider = "DataProviderForIsNegativeMethod", description = "Test isNegative method of Calculator class", alwaysRun = true)
	public void testIsNegativeMethod(long a){
		boolean result = calculator.isNegative(a);
		Assert.assertEquals(result, true,
				"Invalid value inptu: "+a+" is positive value");
	}
	
	@Test(groups = "CalculatorMethods", dataProviderClass = DataProviders.class, dataProvider = "DataProviderForIsPositiveMethod", description = "Test isPositive method of Calculator class", alwaysRun = true)
	public void testIsPositiveMethod(long a){
		boolean result = calculator.isPositive(a);
		Assert.assertEquals(result, true,
				"Invalid value input: "+a+" is negative value");
	}
	
	
	
	
	//Negative scenarios:
	@Test(expectedExceptionsMessageRegExp="Attempt to divide by zero", expectedExceptions = NumberFormatException.class, dataProviderClass = DataProviders.class, dataProvider = "DataProviderForDivByZero", groups = "CalculatorMethodsNegative")
	public void TestDivByZeroLong (long a, long b){
		calculator.div(a, b);
	}
	
	
	@Test(expectedExceptions = NumberFormatException.class, dataProviderClass = DataProviders.class, dataProvider = "DataProviderForDivByZero", groups = "CalculatorMethodsNegative")
	public void TestDivByZero (double a, double b){
		calculator.div(a, b);
	}
	
	@Test(groups = "CalculatorMethodsNegative", dataProviderClass = DataProviders.class, dataProvider = "DataProviderForIsNegativeMethodNeg", description = "Test isNegative method of Calculator class", alwaysRun = true)
	public void testIsNegativeMethodNeg(long a){
		boolean result = calculator.isNegative(a);
		Assert.assertEquals(result, false,
				"Invalid value inptu: "+a+" is positive value");
	}
	
	@Test(groups = "CalculatorMethodsNegative", dataProviderClass = DataProviders.class, dataProvider = "DataProviderForIsPositiveMethodNeg", description = "Test isPositive method of Calculator class", alwaysRun = true)
	public void testIsPositiveMethodNeg(long a){
		boolean result = calculator.isPositive(a);
		Assert.assertEquals(result, false,
				"Invalid value input: "+a+" is negative value");
	}

	
//Parallel tests:
	
	@Test(groups="parallel", description="To test parallel tests execution")
	public void testParallel(){
		System.out.println(checkTime());
		timeout.sleep(2);
	}
	
	@Test(groups="parallel", description="To test parallel tests execution")
	public void testParallel1(){
		System.out.println(checkTime());
		timeout.sleep(2);
	}
	
	@Test(groups="parallel", description="To test parallel tests execution")
	public void testParallel2(){
		System.out.println(checkTime());
		timeout.sleep(2);
	}
	@Test(groups="parallel", description="To test parallel tests execution")
	public void testParallel3(){
		System.out.println(checkTime());
		timeout.sleep(2);
	}
	@Test(groups="parallel", description="To test parallel tests execution")
	public void testParallel4(){
		System.out.println(checkTime());
		timeout.sleep(2);
	}
	
}
