package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern6Test
{

	@Test
	public void additionTester()
	{
		
		Pattern6.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern6 b = new Pattern6();
		Assertions.assertTrue(b instanceof Pattern6);
	}
}
	
