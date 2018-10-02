package com.epam.tat.unittest.testrunners;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.epam.tat.unittest.listeners.CalculatorMethodsTestListener;

public class CalculatorMethodsTestCustomRunner {

	public static void main(String[] args) {
		CalculatorMethodsTestListener calculatorMethodsTestListener= new CalculatorMethodsTestListener();
		TestNG testNg = new TestNG();
		
		XmlSuite customSuite = new XmlSuite();
		customSuite.setName("CustomSiute");
		customSuite.setParallel(XmlSuite.ParallelMode.METHODS);
		customSuite.setThreadCount(4);
		
		List<String> files=new ArrayList<>();
		files.addAll(new ArrayList<String>(){{
			add("appClientModule/com/epam/tat/unittest/testrunners/CalculatorMethodsTestingParallel.xml");}});
		customSuite.setSuiteFiles(files);
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(customSuite);
		testNg.setXmlSuites(suites);
		testNg.addListener(calculatorMethodsTestListener);
		testNg.run();
		
		}
				
	}


