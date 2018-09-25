package Package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=1)
  public void f() {
	  int a=10;
	  int b=20;
	  int c=a+b;
	  Assert.assertEquals(c,30);
  }

@Test(priority=2)
public void verifyButton()
{
	int a=20;
	int b=30;
	int c=a+b;
	Assert.assertEquals(c,50);
}
@Test(enabled=false)
public void verifyB()
{
	System.out.println("TestB method");
}
@Test(priority=3)
public void verifyC()
{
	System.out.println("TestC Method");
}
}