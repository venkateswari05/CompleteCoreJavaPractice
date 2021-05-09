package completecorejavacourse.OOPS;

public class Gender 
{
	private String type;
	public Gender()
	{
		
	}
	public Gender(String type)
	{
		this.type=type;
	}
	public String gettype()
	{
		return type;
	}
	public String settype(String type)
	{
		return this.type=type;
	}
	public String toString() 
	{
		return this.type;
	}
}
