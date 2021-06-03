package OOPS.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.OOPS.*;

public class HouseTest 
{
	
	@Test
	public void HouseTester()
	{
		House t = new House();
		Assertions.assertTrue(t instanceof House);
	}
	
	@Test
	public void HouseTester1()
	{
		House t1 = new House();
		t1.setid(1);
		Assertions.assertEquals(1, t1.getid());
		Assertions.assertNotEquals(2, t1.getid());
		
	}
	
	@Test
	public void HouseTester2()
	{
		House t2 = new House();
		t2.setname("Psychoo");
		Assertions.assertEquals("Psychoo", t2.getname());
		Assertions.assertNotEquals("Rajendra", t2.getname());
		
	}
	@Test
	public void HouseTester8()
	{
		Hall t1 = new Hall();
		t1.setisDinning(true);
		Assertions.assertEquals(true, t1.getisDinning());
		Assertions.assertNotEquals(false, t1.getisDinning());
		
	}
	
	@Test
	public void HouseTester9()
	{
		Hall s = new Hall(11,22,true);
		House t3 = new House(1,"psycho",s);
		t3.setHall(s);
		Assertions.assertEquals(s, t3.getHall());
		Assertions.assertNotEquals(null, t3.getHall());
	}
	
	@Test
	public void HouseTester3()
	{
		Hall s = new Hall(11,22,true);
		House t3 = new House(2,"Rajendra",s);
		Assertions.assertEquals("2 Rajendra 11 22 true", t3.toString());
		Assertions.assertNotEquals("1 Rajendra 2 5 false", t3.toString());
		
	}
	
	@Test
	public void HouseTester4()
	{
		
		Hall s = new Hall(11,22,true);
		Assertions.assertEquals("11 22 true", s.toString());
		Assertions.assertNotEquals(null, s.toString());
		
	}
	
	@Test
	public void HouseTester5()
	{
		Hall s = new Hall();
		Assertions.assertTrue(s instanceof Hall);
	}
	
	
}
