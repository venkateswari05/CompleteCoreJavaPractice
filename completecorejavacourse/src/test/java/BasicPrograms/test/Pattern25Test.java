package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern25Test
{

	@Test
	public void additionTester()
	{
		
		Pattern25.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern25 b = new Pattern25();
		Assertions.assertTrue(b instanceof Pattern25);
	}
}
	
