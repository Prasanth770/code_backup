class A implements Runnable  
{
	public void run()
	{
		try
		{
			for(int i =0 ; i<=25 ;i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i );
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
	
		}	
	}
}
class Demoo3
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

		t1.setPriority(6);
		t2.setPriority(2);	



		try
		{
			for(int k =0 ;k<=25 ;k++)
			{  

				if(k==5)
					t2.suspend();
				if(k==10)
					t2.resume();
				if(k==15)
					System.out.println(t1.isAlive());// true 
				if(k==17)
					t1.stop();
				if(k==20)
					System.out.println(t1.isAlive());// false  
				
				System.out.println("			 " +"K : "+k);
				Thread.sleep(1000);

			}
		}
		catch(InterruptedException ie)
		{
	
		}		
					
	}
}