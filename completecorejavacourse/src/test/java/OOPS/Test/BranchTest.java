package OOPS.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.OOPS.*;

public class BranchTest 
{
	
	@Test
	public void branchTester()
	{
		Branch b = new Branch();
		Assertions.assertTrue(b instanceof Branch);
	}
	
	@Test
	public void branchTester6()
	{
		Student t = new Student();
		Assertions.assertTrue(t instanceof Student);
	}
	
	@Test
	public void branchTester5()
	{
		Student t1 = new Student();
		t1.setid(1);
		Assertions.assertEquals(1, t1.getid());
		Assertions.assertNotEquals(2, t1.getid());
		
	}
	
	@Test
	public void branchTester7()
	{
		Student t2 = new Student();
		t2.setname("Psychoo");
		Assertions.assertEquals("Psychoo", t2.getname());
		Assertions.assertNotEquals("Rajendra", t2.getname());
		
	}
	@Test
	public void branchTester1()
	{
		Branch b1 = new Branch();
		b1.setId(1);
		Assertions.assertEquals(1, b1.getId());
		Assertions.assertNotEquals(2, b1.getId());
		
	}
	
	@Test
	public void branchTester2()
	{
		Branch b2 = new Branch();
		b2.setName("Psychoo");
		Assertions.assertEquals("Psychoo", b2.getName());
		Assertions.assertNotEquals("Rajendra", b2.getName());
		
	}
	
	@Test
	public void branchTester8()
	{
		Student t2 = new Student();
		Branch b1 = new Branch(2,"Rajendra");
		t2.setbranch(b1);
		Assertions.assertEquals(b1, t2.getbranch());
		Assertions.assertNotEquals(null, t2.getbranch());
		
	}
	
	@Test
	public void EmployeeTester3()
	{
		Branch s = new Branch(1,"CSE");
		Student t3 = new Student(2, "Rajendra",s);
		Assertions.assertEquals("2 Rajendra 1 CSE", t3.toString());
		Assertions.assertNotEquals("1 Rajendra 20 EEE", t3.toString());
		
	}
	@Test
	public void branchTester3()
	{
		Branch b1 = new Branch(2,"Rajendra");
		Assertions.assertEquals("2 Rajendra", b1.toString());
		Assertions.assertNotEquals("1 Rajendra", b1.toString());
		
	}
}
