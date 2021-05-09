package completecorejavacourse.OOPS;

public class Teacher
{
	private int id;
	private String name;
	private Subject subject;
	public Teacher()
	{

	}
	public Teacher(int id,String name,Subject subject)
	{
		this.id=id;
		this.name=name;
		this.subject=subject;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setsubject(Subject subject)
	{
		this.subject=subject;
	}
	public Subject getsubject()
	{
		return subject;
	}
	public boolean equals(Teacher t)
	{
		if(this.id==t.id && this.name==t.name && this.subject==t.subject)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return this.id +" " + this.name + " " + this.subject;
	}
}

