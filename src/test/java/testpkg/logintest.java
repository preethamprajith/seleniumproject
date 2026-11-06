package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.baseclass;
import pagepkg.loginpage;

public class logintest extends baseclass{
	
	@Test
	
	public void titileverification()
	{
		String actualtitle = loginobj.titlemethod();
		Assert.assertEquals(actualtitle, "swaglabs");
	}
	
	@Test 
	
	public void loginvalidation()
	{
		loginobj.loginmethod("abc@gmail.com", "1234");
	}
	

}
