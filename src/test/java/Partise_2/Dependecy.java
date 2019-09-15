package Partise_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependecy {
@Test(priority=1)
public void Regist()
{
	Assert.fail("Failed");
	System.out.println("registration  sucesful");
}
@Test(priority=2, dependsOnMethods="Regist", alwaysRun=true)
public void Login()
{
	System.out.println("Login passed");
}
}
