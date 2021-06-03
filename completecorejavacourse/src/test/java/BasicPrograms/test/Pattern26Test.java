package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern26Test
{

	@Test
	public void additionTester()
	{
		
		Pattern26.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern26 b = new Pattern26();
		Assertions.assertTrue(b instanceof Pattern26);
	}
}
	
