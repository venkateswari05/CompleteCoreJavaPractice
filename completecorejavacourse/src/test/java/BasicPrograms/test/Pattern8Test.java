package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern8Test
{

	@Test
	public void additionTester()
	{
		
		Pattern8.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern8 b = new Pattern8();
		Assertions.assertTrue(b instanceof Pattern8);
	}
}
	
