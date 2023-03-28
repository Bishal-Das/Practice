package CollectionInterface8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.xml.sax.HandlerBase;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<>(); //anything can be added  //mutable
		values.add(21);  //Integer a = new Integer(1)
		values.add(32);
		values.add(54);
		values.add(3, 63);  //3 added in index 2
//		Iterator it = values.iterator();
//		
//		while(it.hasNext())
//			System.out.println(it.next());
		for(int i=0; i<values.size();i++)
			System.out.println(values.get(i));
		
		Collections.reverse(values);   //using Collections class
		//COMPARABLE
		Comparator<Integer> c = new Comparator<Integer>()
				{
					public int compare(Integer i, Integer j)
					{
						if(i%10 > j%10)
							return 1;
						else
							return -1;
					}
				};
		Collections.sort(values, c);
		
		for(Object o : values)
			System.out.println(o);
//		Collection<Integer> num = new ArrayList<>();
//	
//		Set<Integer> set = new HashSet<>(); //Hashset implements Set

	}

}
