import java.io.*;
class A 
{
	public void xyz() throws MaxAgeException , IOException 
	{
		for(int  i=0;i<=20;i++)
		{	
			
			if(i==10) throw new MaxAgeException("you cant enter more then 100 ");
			if(i==5) throw new IOException();
			//if(i==15) throw new NullPointerException();
			System.out.println("I "+i);
		}
	}
}
class Demoo2
{
	public static void main(String args[])
	{
		try
		{
			A a =new A();
			a.xyz();
		}
		catch(NullPointerException np)
		{
			System.out.print(" null poingter excceptrioncame  ");
		}
		catch( IOException io)
		{
			System.out.println("IO came ");
		}
		catch(MaxAgeException ma)
		{
			System.out.println(ma);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(" Thank you . Programs terminates ");
		}	
	}
}
class MaxAgeException  extends Exception 
{
	 MaxAgeException(String msg)
	{
		super(msg);
	}
}