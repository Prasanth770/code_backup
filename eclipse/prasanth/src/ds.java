import java.util.ArrayList;
import java.util.*;

public class ds {

	public static void main(String[] args) {
		//ArrayList al = new ArrayList();
		//LinkedList al = new LinkedList();
		//list allow duplicate, order same as entered
		//set  doesn't allow duplicate, no order 
		//HashSet al = new HashSet(); no dup, no order
		//LinkedHashSet al = new LinkedHashSet(); no dup order same as entered
		TreeSet al = new TreeSet();
		al.add(100);
		al.add(40);
		al.add(500);
		al.add(1200);
		al.add(50);
		al.add(6666);
		al.add(101);
		al.add(100);
		
		Iterator i1 = al.iterator();
		while(i1.hasNext());
		{
			System.out.println(i1.next());
		}

	}

}
