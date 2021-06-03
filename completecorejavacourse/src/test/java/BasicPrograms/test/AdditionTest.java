package BasicPrograms.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.BasicProblems.Repractice1;

public class AdditionTest
{

	@Test
	public void additionTester()
	{
		
		Repractice1.main(null);
	}
	
	@Test
	public void additionTester1()
	{
		
		Repractice1.Addition(5,4);
	}
	
	@Test
	public void additionTester2()
	{
		Repractice1 b = new Repractice1();
		Assertions.assertTrue(b instanceof Repractice1);
	}
}
	
