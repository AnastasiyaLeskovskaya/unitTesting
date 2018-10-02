package com.epam.tat.unittest.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name = "DataProviderForSumMethod")
	public Object[][] dataProvider() {
		return new Object[][] { 
			{ 3, 2, 5 },
			{ -4, 2, -2 },
			{ 0, 2, 2 },
			{ -15, -35, -50 },

		};
	}

	@DataProvider(name = "DataProviderForMultMethod")
	public  Object[][] dataProvider1() {
		return new Object[][] { 
			{ 3, 2, 6 },
			{-3, 2, -6 },
			{ -3, -2, 6 },
			{ 199, 0, 0 },
			{ 0, -4, 0 },

		};
	}
	
	@DataProvider(name = "DataProviderForDivByZero")
	public Object [][] dataProvider2 (){
		return new Object[][] { 
			{ 3, 0},
			{-3, 0},
			{ -3, 0},
			
		};
		
	}
	
	@DataProvider(name = "DataProviderForDivMethod")
	public Object [][] dataProvider3 (){
		return new Object[][] { 
			{ 3, 3, 1 },
			{-3, 3, -1 },
			{ -6, -2, 3 },
			{ 199, 0, 0 },
						
		};
		
	}
	
	@DataProvider(name = "DataProviderForIsNegativeMethod")
	public Object [][] dataProvider4 (){
		return new Object[][] { 
			{ -1 },
			{-100 },
			{-5 },
									
		};
		
	}
	
	@DataProvider(name = "DataProviderForIsPositiveMethod")
	public Object [][] dataProvider5 (){
		return new Object[][] { 
			{ 1 },
			{100 },
			{5 },
			
									
		};
		
	}
	
	@DataProvider(name = "DataProviderForIsNegativeMethodNeg")
	public Object [][] dataProvider6 (){
		return new Object[][] { 
			{ 1 },
			{100 },
			{5 },
			{0 },
									
		};
		
	}
	
	@DataProvider(name = "DataProviderForIsPositiveMethodNeg")
	public Object [][] dataProvider7 (){
		return new Object[][] { 
			{ -11 },
			{-1100 },
			{-55 },
			{0 },
									
		};
		
	}
	
}
