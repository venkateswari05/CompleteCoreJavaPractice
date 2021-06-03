package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern5Test
{

	@Test
	public void additionTester()
	{
		
		Pattern5.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern5 b = new Pattern5();
		Assertions.assertTrue(b instanceof Pattern5);
	}
}
	
