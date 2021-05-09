package completecorejavacourse.OOPS;

public class House
{
	private int id;
	private String name;
	private Hall hall;

	public House()
	{

	}
	public House(int id,String name,Hall hall)
	{
		this.id=id;
		this.name=name;
		this.hall=hall;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setnumofrooms(Hall hall)
	{
		this.hall=hall;
	}
	public int getid()
	{
		return this.id;
	}
	public String getname()
	{
		return this.name;
	}
	public Hall hall()
	{
		return this.hall;
	}
	public String toString()
	{
		return this.id +" " + this.name + " " + this.hall;
	}
}