package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern3Test
{

	@Test
	public void additionTester()
	{
		
		pattern3.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		pattern3 b = new pattern3();
		Assertions.assertTrue(b instanceof pattern3);
	}
}
	
