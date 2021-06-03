package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern21Test
{

	@Test
	public void additionTester()
	{
		
		Pattern21.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern21 b = new Pattern21();
		Assertions.assertTrue(b instanceof Pattern21);
	}
}
	
