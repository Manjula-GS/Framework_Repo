package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest()
	{
		String Url = System.getProperty("url");
		String Browser = System.getProperty("browser", "chrome");
		String Username = System.getProperty("usn");
		String Password = System.getProperty("psw");
		
		System.out.println(Url);
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
		
		System.out.println("execute createContactTest");
	}
	@Test
	public void ModifyContactTest()
	{
		System.out.println("execute ModifyContactTest");
	}

}
