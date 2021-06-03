package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern14Test
{

	@Test
	public void additionTester()
	{
		
		Pattern14.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern14 b = new Pattern14();
		Assertions.assertTrue(b instanceof Pattern14);
	}
}
	
