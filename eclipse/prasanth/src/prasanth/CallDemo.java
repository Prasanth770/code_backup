package prasanth;

import java.util.*;

public class CallDemo {

	public static void main(String[] args) {
		//ArrayList al = new ArrayList();
		LinkedList al = new LinkedList();
		al.add(100);
		al.add("Prasanth");
		al.add(true);
		al.add('A');
		al.add(10.6);
		al.add(new Date());
		al.addFirst(101);
		al.addLast(999999);

		System.out.println(al);
		
		System.out.println("-----------------------");
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("---------Iterator--------------");
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ArrayList al2=new ArrayList();
		al2.add(999);
		al2.add(777);
		al2.add(666);
				/*
		System.out.println("=====");
				Iterator i1=al2.iterator();
				while (i1.hasNext()) {
					System.out.println(i1.next());
				}
				System.out.println("==Add All ===");
				al.addAll(al2);
				System.out.println(al);
				System.out.println(al.contains(999));
				System.out.println(al.size());
				System.out.println(al.isEmpty());
				System.out.println("Removed : "+al.remove(7));
				System.out.println(al.contains(999));*/
	}

}
