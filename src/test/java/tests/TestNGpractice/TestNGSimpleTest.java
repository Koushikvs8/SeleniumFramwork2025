package tests.TestNGpractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.LoginDommyDataProvider;

public class TestNGSimpleTest extends TestNGBase {
	
	@Test(groups = {"Regression"} ,dataProvider ="logindata",  dataProviderClass = LoginDommyDataProvider.class)
	 public void testA(String username ,String password) { 
	System.out.println("the test A is executed");
	 String str = "TestNG is working fine";
	 Assert.assertTrue(true);
     Assert.assertEquals("TestNG is working fine", str);
	 }

	@Test
	 public void testB() {
		System.out.println("the test B is executed");
	 String str = "TestNG is working fine";
	 Assert.assertTrue(true);
    Assert.assertEquals("TestNG is working fine", str);
	 }



	@Test
	 public void testC() {
		System.out.println("the test C is executed");
	 String str = "TestNG is working fine";
	 Assert.assertTrue(true);
    Assert.assertEquals("TestNG is working fine", str);
	 }
	
	
	
}
