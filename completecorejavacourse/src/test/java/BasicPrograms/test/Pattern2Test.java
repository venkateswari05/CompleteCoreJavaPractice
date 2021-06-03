package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern2Test
{

	@Test
	public void additionTester()
	{
		
		Pattern2.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern2 b = new Pattern2();
		Assertions.assertTrue(b instanceof Pattern2);
	}
}
	
