package completecorejavacourse.OOPS;

public class Subject
{

	private int id;
	private String name;
	
	public Subject()
	{
		
	}
	public Subject(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return this.id +" " + this.name;
	}
}
