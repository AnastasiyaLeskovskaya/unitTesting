package com.epam.tat.unittest.listeners;

import java.util.logging.Logger;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CalculatorMethodsTestListener implements IInvokedMethodListener {
	private static Logger Logging = Logger.getLogger("InfoLogging");

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		Logging.info("Test for Method " + method.getTestMethod().getMethodName() + " is started");

	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		Logging.info("Test for Method " + method.getTestMethod().getMethodName() + " is completed");
		System.out.println("Result is: " + testResult.getStatus() + "\n");

	}

}
