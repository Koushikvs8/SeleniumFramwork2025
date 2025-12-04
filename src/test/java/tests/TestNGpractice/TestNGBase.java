package tests.TestNGpractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGBase {

	@BeforeTest
	 public void BeforeTest() {
	System.out.println("The BeforeTest is Executed");
	 }
	@BeforeClass
	 public void BeforeClass() {
	System.out.println("The BeforeClass is Executed  /////////////");
	 }
     @Parameters("browser")
	@BeforeMethod
	 public void BeforeMethod(@Optional String browser) {
	System.out.println("The BeforeMethod is Executed" + "/////" +browser);
	 }

	@AfterMethod
	 public void AfterMethod() {
	System.out.println("The AfterMethod is Executed");
	 }

	
	@AfterClass
	 public void AfterClass() {
	System.out.println("The AfterClass is Executed /////////////////");
	 }
	
	@AfterTest
	 public void AfterTest() {
	System.out.println("The AfterTest is Executed");
	 }
	
}
