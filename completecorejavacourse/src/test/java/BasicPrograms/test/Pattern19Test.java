package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern19Test
{

	@Test
	public void additionTester()
	{
		
		Pattern19.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern19 b = new Pattern19();
		Assertions.assertTrue(b instanceof Pattern19);
	}
}
	
