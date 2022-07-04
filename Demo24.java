package p3;

class D {
		int a = 100;
		public void finalize() {
			System.out.println("object removed");
		}
}

public class Demo24 {
	public static void main(String[] args)
	{
		D d = new D();
		System.out.println(d.a);
		d=null;
		System.gc();
	}
}