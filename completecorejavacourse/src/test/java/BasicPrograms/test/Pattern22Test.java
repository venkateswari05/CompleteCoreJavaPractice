package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern22Test
{

	@Test
	public void additionTester()
	{
		
		Pattern22.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern22 b = new Pattern22();
		Assertions.assertTrue(b instanceof Pattern22);
	}
}
	
