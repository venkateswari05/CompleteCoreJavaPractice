package completecorejavacourse.Collections;

public class Role
{

	private int id;
	private String name;
	private boolean ispsychoo;
	public Role()
	{
		
	}
	public Role(int id,String name,Boolean ispsychoo)
	{
		this.id=id;
		this.name=name;
		this.ispsychoo=ispsychoo;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public boolean getispsychoo()
	{
		return ispsychoo;
	}
	public void setispsychoo(boolean ispsychoo)
	{
		this.ispsychoo=ispsychoo;
	}
	public String toString()
	{
		return this.id +" " + this.name +" " +this.ispsychoo;
	}
}
