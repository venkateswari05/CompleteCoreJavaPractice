package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern17Test
{

	@Test
	public void additionTester()
	{
		
		Pattern17.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern17 b = new Pattern17();
		Assertions.assertTrue(b instanceof Pattern17);
	}
}
	
