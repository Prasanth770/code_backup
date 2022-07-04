import java.util.*;

public class Listt {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		//Vector al= new Vector();
		al.add(100);
		al.add("Prasanth");
		al.add(500);
		al.add('A');
		al.add(10.6);
		al.add(6666);
		al.add(101);
		al.add(999999);
		System.out.println("--------Iterator----");
		
		Iterator x = al.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}
	
	System.out.println("--------List Iterator----");
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("--------REverse---");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		/*Enumeration e = al.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}*/
	}
}


