package Pages;

import org.openqa.selenium.By;



public class MercuryToursPage extends LaunchApp {
	
	//locators
	By lnkRegister = By.xpath("//a[text()='REGISTER']");
	By txtFirstName = By.name("firstName");
	By txtUserName = By.name("email");
	By txtPassword = By.name("password");
	By txtCfmPwd = By.name("confirmPassword");
	By btnSubmit = By.name("register");
	By lnkSignon = By.xpath("//a[text()='SIGN-OFF']");
		
	boolean flag;

	

	//Verify register page
	public boolean openRegisterPage() throws InterruptedException
	{
		driver.findElement(lnkRegister).click();
		Thread.sleep(4000);
		if(driver.findElement(txtFirstName).isDisplayed())
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
		
	}
	
	//do the registration
	public boolean registration(String UN,String Pwd) {
		driver.findElement(txtUserName).sendKeys(UN);
		driver.findElement(txtPassword).sendKeys(Pwd);
		driver.findElement(txtCfmPwd).sendKeys(Pwd);
		driver.findElement(btnSubmit).click();
		
		return true;
		
	}
	
	//Verifying registration is success
	public boolean verifyregistration()
	{
		if(driver.findElement(lnkSignon).isDisplayed())
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
	}
	
	public void closeApp()
	{
		driver.quit();
	}
	
}
