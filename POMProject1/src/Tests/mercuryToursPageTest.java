package Tests;

import Pages.*;

public class mercuryToursPageTest {
public static boolean status;

	public static void main(String[] args) throws InterruptedException {
		MercuryToursPage mtp = new MercuryToursPage();
		
		//Launching the application
		mtp.launchApp("chrome", "http://newtours.demoaut.com");

		//Open registration page
		status = mtp.openRegisterPage();
		
		//Do the registration
		status = mtp.registration("Bharath","paul");
		
		//Verify the registration
		status = mtp.verifyregistration();
		if(status=true)
		{
			System.out.println("Registration is success");
		}
		else
		{
			System.out.println("Registration is Failed");
		}
		
		//Close the application
		mtp.closeApp();
	}

}
