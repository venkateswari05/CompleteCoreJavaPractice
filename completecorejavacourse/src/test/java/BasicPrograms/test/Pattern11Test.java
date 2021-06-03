package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern11Test
{

	@Test
	public void additionTester()
	{
		
		Pattern11.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern11 b = new Pattern11();
		Assertions.assertTrue(b instanceof Pattern11);
	}
}
	
