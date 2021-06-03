package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern24Test
{

	@Test
	public void additionTester()
	{
		
		Pattern24.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern24 b = new Pattern24();
		Assertions.assertTrue(b instanceof Pattern24);
	}
}
	
