package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern16Test
{

	@Test
	public void additionTester()
	{
		
		Pattern16.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern16 b = new Pattern16();
		Assertions.assertTrue(b instanceof Pattern16);
	}
}
	
