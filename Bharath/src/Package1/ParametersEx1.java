package Package1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx1 {
	@Test
	@Parameters(value= {"Browser","Waittime"})
	public void params(String browser,int wait)
	{
		System.out.println("Browser Name is "+ browser);
		System.out.println("Wait time is "+ wait);
	}
}
