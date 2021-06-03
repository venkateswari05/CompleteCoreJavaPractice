package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern20Test
{

	@Test
	public void additionTester()
	{
		
		Pattern20.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern20 b = new Pattern20();
		Assertions.assertTrue(b instanceof Pattern20);
	}
}
	
