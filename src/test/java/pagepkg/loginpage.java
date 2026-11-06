package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"user-name\"]") WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]") WebElement password;
	
	@FindBy(xpath="//*[@id=\"login-button\"]") WebElement button;
	
	
	
	public loginpage(WebDriver driver)// constuctor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String titlemethod()
	{
	String title = driver.getTitle();
	return title;
	
	}
	
	
 public void loginmethod(String un,String pwd)
 {
 username.sendKeys("hydra");
 password.sendKeys("123");
 button.click();
 }
}


