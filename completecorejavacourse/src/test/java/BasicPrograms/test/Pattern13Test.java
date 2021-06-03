package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern13Test
{

	@Test
	public void additionTester()
	{
		
		Pattern13.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern13 b = new Pattern13();
		Assertions.assertTrue(b instanceof Pattern13);
	}
}
	
