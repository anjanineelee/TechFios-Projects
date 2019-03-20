package com.TestCasesExcetution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import TestBase.Testbase;
import TestPages.toggleTestpage;

public class ToggleTestCaseExecution extends Testbase{
	toggleTestpage ttp;
	
	public ToggleTestCaseExecution()//constructor is responsible to communicate 
	{
		super();
	}
	
	@Before
	public void setup() throws Exception
	{
		initialize();
		ttp = new toggleTestpage();// calling toggleTestpage page here
		Thread.sleep(4000);
	}
	
	@Test
	public void clicktoggleTestpage() throws Exception
	{
		ttp.verifyToggleall();
		Thread.sleep(6000);
		
	}
		
	@After
	public void TearDown()
	{
		driver.quit();
	}
}

