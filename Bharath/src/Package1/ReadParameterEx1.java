package Package1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadParameterEx1 {
	@Test
	@Parameters(value= {"browser","waitTime"})
	public void readparam(String browsername,String wait)
	{
		if(browsername.equalsIgnoreCase("FIREFOX"))
		{
			//set properly
			//launching browser
			System.out.println("Firefox launching code "+ browsername);
			System.out.println("Wait time is "+ wait);
		}
		
	}
}
