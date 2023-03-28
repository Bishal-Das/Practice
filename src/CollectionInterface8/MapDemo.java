package CollectionInterface8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.xml.sax.HandlerBase;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap();
		map.put("name", "Bishal");
		map.put("actor", "HR" );
		map.put("ceo", "marisa");
		map.put("actor", "SRK"); //this replaces first given value i.e HR
		
		Set<String> keys = map.keySet(); 
		for(String k : keys)
			System.out.println(map.get(k));


	}

}
