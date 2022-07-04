class A implements Runnable  
{
	public synchronized  void run()
	{
		try
		{
			for(int i =0 ; i<=10 ;i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i );
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ie)
		{	
		}	
	}
}
class Demoo4
{
	public static void main(String args[])
	{
		A a=new A();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		t1.start();
		t2.start();	
		t1.setName("Seeetha");
		t2.setName("Rama");					
	}
}