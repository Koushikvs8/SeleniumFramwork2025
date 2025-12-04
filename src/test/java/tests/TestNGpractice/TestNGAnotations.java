package tests.TestNGpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAnotations extends TestNGBase {

	@Test(groups = {"smoke", "sanity"})
	 public void testD() {
	System.out.println("the test D is executed");
	 String str = "TestNG is working fine";
	 Assert.assertTrue(true);
    Assert.assertEquals("TestNG is working fine", str);
	 }

	@Test(groups = {"smoke"})
	 public void testE() {
		System.out.println("the test E is executed");
	 String str = "TestNG is working fine";
	 Assert.assertTrue(true);
   Assert.assertEquals("TestNG is working fine", str);
	 }



	@Test(dependsOnMethods = {"testE"})
	 public void testF() {
		System.out.println("the test F is executed");
	 String str = "TestNG is working fine";
	 Assert.assertTrue(true);
   Assert.assertEquals("TestNG is working fine", str);
	 }

}
