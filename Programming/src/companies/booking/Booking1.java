package companies.booking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Booking1 {

	private static final int MAX = 100000; // Max size of Hashmap

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int m = Integer.valueOf(br.readLine());
		int i = 0;
		int[] arr = new int[m];
		for (i = 0; i < m; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		System.out.println(printpairs(arr, N));

	}

	static int printpairs(int arr[], int sum) {
		// Declares and initializes the whole array as false
		boolean[] binmap = new boolean[MAX];

		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			if (temp >= 0 && binmap[temp]) {
				return 1;
			}
		}
		return 0;
	}
}
