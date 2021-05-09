package completecorejavacourse.OOPS;

public class Hall
{

	private int width;
	private int length;
	private boolean isDinning;
	
	public Hall()
	{
		
	}
	public Hall(int width,int length,boolean isDinning)
	{
		this.width=width;
		this.length=length;
		this.isDinning=isDinning;
	}
	public boolean getisDinning()
	{
		return isDinning;
	}
	public void setisDinning(boolean isDinning)
	{
		this.isDinning=isDinning;
	}
	public String toString()
	{
		return this.width+" " + this.length  +" " + this.isDinning;
	}
}
