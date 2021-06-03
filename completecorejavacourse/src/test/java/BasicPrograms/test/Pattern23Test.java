package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern23Test
{

	@Test
	public void additionTester()
	{
		
		Pattern23.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern23 b = new Pattern23();
		Assertions.assertTrue(b instanceof Pattern23);
	}
}
	
