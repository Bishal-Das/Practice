package CollectionInterface8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.xml.sax.HandlerBase;

public class SetDemo {

	public static void main(String[] args) {
		// HashSet - no particular order, TreeSet - sorted order
		Set<Integer> values = new TreeSet<>(); //doesn't support duplicate
		values.add(31);  //Integer a = new Integer(1)
		values.add(22);
		values.add(54);
		values.add(63);  //3 added in index 2
		
		for(int i : values)
			System.out.println(i);


	}

}
