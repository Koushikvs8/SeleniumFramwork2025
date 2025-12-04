package utilities;

import org.testng.annotations.DataProvider;

public class LoginDommyDataProvider {


	@DataProvider(name="logindata")
	public static Object[][] dataProvider()
	{    String [][] data = {
			
			{"koushik", "12345"},
			{"swathi", "1234@DF"},
			{"naveen", "ty34@DF"}
	};
	   
		
		return data;
	}
}
