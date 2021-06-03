package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern15Test
{

	@Test
	public void additionTester()
	{
		
		Pattern15.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern15 b = new Pattern15();
		Assertions.assertTrue(b instanceof Pattern15);
	}
}
	
