package completecorejavacourse.OOPS;

public class Employee
{
	private int id;
	private String name;
	private int experience;
	private boolean isfulltime;
	private Role role;
	public Employee() 
	{
		
	}
	public Employee(int id,String name,int experience,boolean isfulltime,Role role)
	{
		this.id=id;
		this.name=name;
		this.experience=experience;
		this.isfulltime=isfulltime;
		this.role=role;
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
	public void setexperience(int experience)
	{
		this.experience=experience;
	}
	public int getexperience()
	{
		return experience;
	}
	public void setisfulltime(boolean isfulltime)
	{
		this.isfulltime=isfulltime;
	}
	public boolean getisfulltime()
	{
		return isfulltime;
	}
	public void setrole(Role role)
	{
		this.role=role;
	}
	public Role getrole()
	{
		return role;
	}
	public String toString()
	{
		return this.id +" " + this.name + " " +this.experience +" " + this.isfulltime + " " + this.role;
	}
	
}
