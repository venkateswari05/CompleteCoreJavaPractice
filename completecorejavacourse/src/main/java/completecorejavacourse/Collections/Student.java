public class Student 
{
	private int id;
	private String name;
	private String branch;
	
	public Student()
	{
		
	}
	public Student(int id,String name,String branch)
	{
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getbranch()
	{
		return branch;
	}
	public void setbranch(String branch)
	{
		this.branch=branch;
	}
	public boolean equals(Student s)
	{
		if(!(this.id==s.id))
		{
			return false;
		}
		if(!(this.name==s.name))
		{
			return false;
		}
		return true;
	}
	public String toString()
	{
		return this.id +" " + this.name + " " + this.branch;
	}
	
}
