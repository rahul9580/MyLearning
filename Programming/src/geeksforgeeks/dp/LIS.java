/**
 * 
 */
package geeksforgeeks.dp;

/**
 * @author rahul
 *
 */
public class LIS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int[] mem = new int[arr.length];
		int lislen = mem[0];
		mem[0] = 1;
		int maxlenidx = 0;
		for (int i = 1; i < arr.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && mem[j] > max) {
					max = mem[j];
				}
			}
			mem[i] = 1 + max;
			if (lislen < mem[i]) {
				maxlenidx = i;
				lislen = mem[i];
			}
		}

		System.out.println(lislen);
		printLis(arr, mem, maxlenidx, lislen);
	}

	static void printLis(int arr[], int mem[], int idx, int value) {
		int[] lis = new int[value];
		for (int i = idx; i >= 0; i--) {
			if (mem[i] == value) {
				value--;
				lis[value] = arr[i];
			}
		}
		for (int l : lis)
			System.out.println(l);
	}
}
