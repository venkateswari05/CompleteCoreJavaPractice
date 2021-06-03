package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.Patterns.*;

public class Pattern27Test
{

	@Test
	public void additionTester()
	{
		
		Pattern27.main(null);
	}
	
	@Test
	public void additionTester2()
	{
		Pattern27 b = new Pattern27();
		Assertions.assertTrue(b instanceof Pattern27);
	}
}
	
