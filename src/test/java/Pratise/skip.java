package Pratise;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skip {
	@Test
	public static void Skip1()
	{
		throw new SkipException("skiping the test-cases because of expection");
	}

}
