package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern12Test
{

	@Test
	public void additionTester()
	{
		
		Pattern12.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern12 b = new Pattern12();
		Assertions.assertTrue(b instanceof Pattern12);
	}
}
	
