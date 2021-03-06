/**
 * 
 */
package algo;

/**
 * @author rahul
 *
 */
public class CheckMaxOrMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(countMaxMin(150, 200));
	}

	private static int countMaxMin(int a, int b) {
		int count = 0;
		for (int i = a; i <= b; i++) {
			int num = i;
			int arr[] = new int[100];
			int j = 0;
			while (num > 0) {
				arr[j] = num % 10;
				num = num / 10;
				j++;
			}
			for (int k = 1; k < j - 1; k++) {
				if ((arr[k - 1] < arr[k] && arr[k + 1] < arr[k]) || (arr[k - 1] > arr[k] && arr[k + 1] > arr[k])) {
					count++;
				}
			}
		}
		return count;
	}
}
