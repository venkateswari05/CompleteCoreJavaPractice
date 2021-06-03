package OOPS.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import completecorejavacourse.OOPS.*;

public class TeacherTest 
{
	
	@Test
	public void teacherTester()
	{
		Teacher t = new Teacher();
		Assertions.assertTrue(t instanceof Teacher);
	}
	
	@Test
	public void teacherTester1()
	{
		Teacher t1 = new Teacher();
		t1.setid(1);
		Assertions.assertEquals(1, t1.getid());
		Assertions.assertNotEquals(2, t1.getid());
		
	}
	
	@Test
	public void teacherTester2()
	{
		Teacher t2 = new Teacher();
		t2.setname("Psychoo");
		Assertions.assertEquals("Psychoo", t2.getname());
		Assertions.assertNotEquals("Rajendra", t2.getname());
		
	}
	
	@Test
	public void teacherTester4()
	{
		Teacher t2 = new Teacher();
		Subject s = new Subject(1,"english");
		t2.setsubject(s);
		Assertions.assertEquals(s, t2.getsubject());
		Assertions.assertNotEquals(null, t2.getsubject());
		
	}
	
	@Test
	public void teacherTester3()
	{
		Subject s = new Subject(1,"english");
		Teacher t3 = new Teacher(2,"Rajendra", s);
		Assertions.assertEquals("2 Rajendra 1 english", t3.toString());
		Assertions.assertNotEquals("1 Rajendra 2 english", t3.toString());
		
	}
	
	@Test
	public void teacherTester5()
	{
		Subject s = new Subject();
		Assertions.assertTrue(s instanceof Subject);
	}
	
	@Test
	public void teacherTester6()
	{
		Subject s = new Subject();
		s.setId(1);
		Assertions.assertEquals(1, s.getId());
		Assertions.assertNotEquals(2, s.getId());
		
	}
	
	@Test
	public void teacherTester7()
	{
		Subject s = new Subject();
		s.setName("Psychoo");
		Assertions.assertEquals("Psychoo", s.getName());
		Assertions.assertNotEquals("Rajendra", s.getName());
		
	}
	
}
