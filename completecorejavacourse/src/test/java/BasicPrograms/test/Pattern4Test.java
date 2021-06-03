package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern4Test
{

	@Test
	public void additionTester()
	{
		
		Pattern4.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern4 b = new Pattern4();
		Assertions.assertTrue(b instanceof Pattern4);
	}
}
	
