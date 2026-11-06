package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.loginpage;

public class baseclass {
	

// ella test classine munne browser open cheyum

public static WebDriver driver;
public static loginpage loginobj;
@BeforeMethod
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	
	public void objectmethod()
	{
		loginobj = new loginpage(driver);
	}

}
