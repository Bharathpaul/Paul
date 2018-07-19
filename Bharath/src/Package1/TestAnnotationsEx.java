package Package1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationsEx {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void before()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("After Method");
	}
	
	
	@Test(priority=2,description="this is m1 method",groups= {"SMOKE"})
	public void m1()
	{
		System.out.println("This is testNG m1");
		//Assert.fail();
	}
	
	@Test(priority=1,enabled=true,groups= {"SANITY"})
	public void m2()
	{
		System.out.println("This is testNG m2");
		//Assert.fail();
	}
	
	@Test(priority=-1,groups="FUNCTIONAL")
	public void m3()
	{
		System.out.println("This is testNG m3");
		//Assert.fail();
	}
	
	
	@Test(groups= {"REGRESSION"},invocationCount=1)
	public void m4()
	{
		System.out.println("This is testNG m4");
		//Assert.fail();
	}
}
