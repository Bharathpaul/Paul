package Tests;
import PagesFactory.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.*;
import PagesFactory.LaunchAppPF;
import PagesFactory.MercuryToursPagePF;

public class mercuryToursPageTestPF  {
public static boolean status;

	public static void main(String[] args) throws InterruptedException {
		//Creating object
		MercuryToursPagePF mtp = new MercuryToursPagePF();
		
		//Launching the application
		mtp.launchApp("chrome", "http://newtours.demoaut.com");
		
		//MercuryToursPage mtp = new MercuryToursPage();
		WebDriver driver = LaunchAppPF.driver;
		
		PageFactory.initElements(driver, mtp);
		
		
		//MercuryToursPagePF mtp= PageFactory.initElements(driver, MercuryToursPagePF.class);
		


		//Open registration page
		status = mtp.openRegisterPage();
		
		//Do the registration
		status = mtp.registration("Bharath","Paul");
		
		//Verify the registration
		status = mtp.verifyregistration();
		if(status=true)
		{
			System.out.println("Registration is success");
		}
		else
		{
			System.out.println("Registration is Fasak");
		}
		
		//Close the application
		mtp.closeApp();
	}

}
