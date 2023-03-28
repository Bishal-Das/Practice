package GFG;

import java.util.Scanner;

public class FarthestFromZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {-100, 90, 80, 50, -200, 200};
		int result = farthestfromzero(arr);
		System.out.println("Result is: "+result);
	}

	private static int farthestfromzero(int[] arr) {
		int N = arr.length;
		int l = 0;
		int r = 0;
		int far = 0;
		for(int i=0; i<N; i++) {
			if(arr[i]>0)
				r = Math.max(r, arr[i]);
			if(arr[i]<=0)
				l = Math.min(l, arr[i]);
			if(Math.abs(l)>=Math.abs(r)) {
				far = l;
			}
			else {
				far = r;
			}
		}
		return far;
	}

}
