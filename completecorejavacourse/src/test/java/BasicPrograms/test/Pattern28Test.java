package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern28Test
{

	@Test
	public void additionTester()
	{
		
		Pattern28.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern28 b = new Pattern28();
		Assertions.assertTrue(b instanceof Pattern28);
	}
}
	
