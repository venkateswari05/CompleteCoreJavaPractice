package OOPS.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.OOPS.*;

public class EmployeeTest 
{
	
	@Test
	public void EmployeeTester()
	{
		Employee t = new Employee();
		Assertions.assertTrue(t instanceof Employee);
	}
	
	@Test
	public void EmployeeTester1()
	{
		Employee t1 = new Employee();
		t1.setid(1);
		Assertions.assertEquals(1, t1.getid());
		Assertions.assertNotEquals(2, t1.getid());
		
	}
	
	@Test
	public void EmployeeTester7()
	{
		Employee t1 = new Employee();
		t1.setexperience(100);
		Assertions.assertEquals(100, t1.getexperience());
		Assertions.assertNotEquals(200, t1.getexperience());
		
	}
	

	@Test
	public void EmployeeTester8()
	{
		Employee t1 = new Employee();
		t1.setisfulltime(true);
		Assertions.assertEquals(true, t1.getisfulltime());
		Assertions.assertNotEquals(false, t1.getexperience());
		
	}
	
	@Test
	public void EmployeeTester2()
	{
		Employee t2 = new Employee();
		t2.setname("Psychoo");
		Assertions.assertEquals("Psychoo", t2.getname());
		Assertions.assertNotEquals("Rajendra", t2.getname());
		
	}
	
	@Test
	public void EmployeeTester4()
	{
		Employee t2 = new Employee();
		Role s = new Role(1,"english",true);
		t2.setrole(s);
		Assertions.assertEquals(s, t2.getrole());
		Assertions.assertNotEquals(null, t2.getrole());
		
	}
	
	@Test
	public void EmployeeTester3()
	{
		Role s = new Role(1,"english",true);
		Employee t3 = new Employee(2,"Rajendra",100,true,s);
		Assertions.assertEquals("2 Rajendra 100 true 1 english true", t3.toString());
		Assertions.assertNotEquals("1 Rajendra 20 false 2 english false", t3.toString());
		
	}
	
	@Test
	public void EmployeeTester5()
	{
		Role s = new Role();
		Assertions.assertTrue(s instanceof Role);
	}
	
	@Test
	public void EmployeeTester6()
	{
		Role s = new Role();
		s.setispsychoo(true);
		Assertions.assertEquals(true, s.getispsychoo());
		Assertions.assertNotEquals(false, s.getispsychoo());
		
	}
	
}
