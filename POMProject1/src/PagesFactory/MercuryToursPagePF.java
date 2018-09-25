package PagesFactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class MercuryToursPagePF extends LaunchAppPF  {
	
	boolean flag;
	
	//locators
	/*By lnkRegister = By.xpath("//a[text()='REGISTER']");
	By txtFirstName = By.name("firstName");
	By txtUserName = By.name("email");
	By txtPassword = By.name("password");
	By txtCfmPwd = By.name("confirmPassword");
	By btnSubmit = By.name("register");
	By lnkSignon = By.xpath("//a[text()='SIGN-OFF']");
		*/
	
	@FindBy(how=How.XPATH,using="//a[text()='REGISTER']")
	WebElement lnkRegister;
	
	@FindBy(how=How.NAME,using="firstName")
	WebElement txtFirstName;

	@FindBy(how=How.NAME,using="email")
	WebElement txtUserName;

	@FindBy(how=How.NAME,using="password")
	WebElement txtPassword;
	
	@FindBy(name="confirmPassword")
	WebElement txtCfmPwd;
	
	@FindBy(name="register")
	WebElement btnSubmit;
	
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement lnkSignon;
	
	
	//Verify register page
	public boolean openRegisterPage() throws InterruptedException
	{
		lnkRegister.click();
		Thread.sleep(4000);
		if(txtFirstName.isDisplayed())
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
		txtUserName.sendKeys(UN);
		txtPassword.sendKeys(Pwd);
		txtCfmPwd.sendKeys(Pwd);
		btnSubmit.click();
		
		return true;
		
	}
	
	//Verifying registration is success
	public boolean verifyregistration()
	{
		if(lnkSignon.isDisplayed())
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
	}
	
	
	
}
