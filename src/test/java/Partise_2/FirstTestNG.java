package Partise_2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTestNG {
	@BeforeMethod
	public void check()
	{
		System.out.println("we are checking validations");
	}
	@Test
	public void validation()
	{
		String expected = "hruthik";
		String actaul = "hruthik";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(expected, actaul);
		System.out.println("thanks");
		soft.assertEquals(true, false, "Failing this becasue of overcome");
		System.out.println("works");
		soft.assertAll();
		
	}
	
	
	}


