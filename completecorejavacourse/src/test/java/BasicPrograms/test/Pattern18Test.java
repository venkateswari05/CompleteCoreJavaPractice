package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern18Test
{

	@Test
	public void additionTester()
	{
		
		Pattern18.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern18 b = new Pattern18();
		Assertions.assertTrue(b instanceof Pattern18);
	}
}
	
