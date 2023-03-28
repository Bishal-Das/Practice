package GFG;

import java.util.HashSet;

public class PairWithGivenSumHash {

	//FOR LOOP
	static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
  
            // checking for condition
            if (s.contains(temp)) {
                System.out.println("Yes");
                return;
            }
            s.add(arr[i]);
        }
        System.out.println("No");
    }
	//FOR EACH
	static void pairToSum(int arr[], int sum) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i : arr) {
			int temp = sum - i;
			
			if(hs.contains(temp)) {
				System.out.println("Present");
				System.out.println(i+"+"+temp);
				return;
			}
			hs.add(i);
		}
		System.out.println("Not present");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printpairs(A, n);
        pairToSum(A, n);
	}
	
	
}
