package prasanth;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		/*
		List l = new List();
		ArrayList
		Linked List
		vector
		Stack
		Set s = new Set();
		HashSet
		Linked Hashset
		TreeSet*/
		
		
		
		TreeMap map= new TreeMap();
		map.put(111,"Ramesh");
		map.put(222,"Rajesh");
		map.put(333,"Rakesh");
		map.put(555,"Mahesh");
		map.put(777,"Suresh");
		
		Set s = map.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
