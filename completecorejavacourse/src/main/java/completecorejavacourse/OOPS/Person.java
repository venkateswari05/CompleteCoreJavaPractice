package completecorejavacourse.OOPS;

public class Person 
{
	private int id;
	private int age;
	private String name;
	private int weight;
	private float height;
	private boolean isalive;
	private Gender gender;
	public Person() 
	{
	
	}
	public Person(int id,String name,int age,int weight,float height,boolean isalive,Gender gender)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.isalive=isalive;
		this.gender=gender;
	}
	public boolean getisalive()
	{
		return isalive;
	}
	public void setisalive(boolean isalive)
	{
		this.isalive=isalive;
	}
	public String toString()
	{
		return this.id +" " + this.name + " " + this.age +" " + this.weight + " " + this.height +" " +this.isalive +" "+ this.gender;
	}
}
