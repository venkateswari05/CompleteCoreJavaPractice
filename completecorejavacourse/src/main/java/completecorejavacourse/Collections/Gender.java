public class Gender 
{
	private String name;
	private String type;
	public Gender()
	{
		
	}
	public Gender(String name,String type)
	{
		this.name=name;
		this.type=type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return this.name+ " "+ this.type;
	}
}
