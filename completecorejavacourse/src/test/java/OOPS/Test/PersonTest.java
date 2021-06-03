package OOPS.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.OOPS.*;

public class PersonTest 
{
	
	@Test
	public void personTester()
	{
		Person b = new Person();
		Assertions.assertTrue(b instanceof Person);
	}
	
	@Test
	public void PersonTester1()
	{
		Gender s = new Gender("Female");
		Person t3 = new Person(2,"Rajendra",30,60,5,false,s);
		Assertions.assertEquals("2 Rajendra 30 60 5.0 false Female", t3.toString());
		Assertions.assertNotEquals(null, t3.toString());
		
	}
	
	@Test
	public void personTester2()
	{
		Gender t = new Gender();
		Assertions.assertTrue(t instanceof Gender);
	}
	
	@Test
	public void personTester3()
	{
		Person t1 = new Person();
		t1.setisalive(true);
		Assertions.assertEquals(true, t1.getisalive());
		Assertions.assertNotEquals(false, t1.getisalive());
		
	}
	
	@Test
	public void personTester4()
	{
		Gender t2 = new Gender();
		t2.settype("female");
		Assertions.assertEquals("female", t2.gettype());
		Assertions.assertNotEquals("Rajendra", t2.gettype());
		
	}
	
	@Test
	public void personTester5()
	{
		Gender t2 = new Gender("Male");
		Assertions.assertEquals("Male", t2.toString());
		Assertions.assertNotEquals(null, t2.toString());
		
	}
}
