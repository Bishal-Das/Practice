import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		for(int k : a)
			System.out.print(k + " ");
		
		System.out.println(" ");
		Arrays.sort(a);
		int ans = Arrays.binarySearch(a, 10);
		
		System.out.println(ans);
		
		
		System.out.println(" ");
		
		int d[][] = { 
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		for(int k[] : d)
		{
			for(int l : k)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
