package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern7Test
{

	@Test
	public void additionTester()
	{
		
		Pattern7.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern7 b = new Pattern7();
		Assertions.assertTrue(b instanceof Pattern7);
	}
}
	
