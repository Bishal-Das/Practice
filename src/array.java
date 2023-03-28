import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<Integer> A = new ArrayList<>();
			A.add(13);
			A.add(45);
			A.add(25);


			Comparator<Integer> comp = new Comparator<Integer>()
			{
			public int compare(Integer i, Integer j)
			{
			if(i > j )
			return 1;
			else
			return -1;
			}
			};

			Collections.sort(A, comp);

			for(Object o : A)
			System.out.println(o);

			}
	}


