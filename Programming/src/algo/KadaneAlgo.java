/**
 * 
 */
package algo;

/**
 * @author rahul
 *
 */
public class KadaneAlgo {

	/**
	 * @param args
	 */

	static int findMaxSum(int arr[]) {
		int maxSoFar = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxSoFar) {
				maxSoFar = arr[i];
			}
		}
		if (maxSoFar < 0) {
			return maxSoFar;
		} else {
			maxSoFar = 0;
		}
		int maxIndingHere = 0;

		for (int i = 0; i < arr.length; i++) {
			maxIndingHere += arr[i];
			if (maxIndingHere < 0) {
				maxIndingHere = 0;
			}
			if (maxIndingHere > maxSoFar) {
				maxSoFar = maxIndingHere;
			}
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		int arr[] = { 8, -4, 5, 6, -11 };
		System.out.println(findMaxSum(arr));
	}

}
