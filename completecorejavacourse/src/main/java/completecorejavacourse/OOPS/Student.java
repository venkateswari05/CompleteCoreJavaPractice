package completecorejavacourse.OOPS;

public class Student 
{
	private int id;
	private String name;
	private Branch branch;
	
	public Student()
	{
		
	}
	public Student(int id,String name,Branch branch)
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
	public Branch getbranch()
	{
		return branch;
	}
	public void setbranch(Branch branch)
	{
		this.branch=branch;
	}
	
	public String toString()
	{
		return this.id +" " + this.name + " " + this.branch;
	}
	
}
