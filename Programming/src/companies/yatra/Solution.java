package companies.yatra;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());

		for (int i = 0; i < T; i++) {
			int n = Integer.valueOf(br.readLine());
			String s = br.readLine();
			int pre[] = new int[n];
			String[] strArr = s.split(" ");
			for (int j = 0; j < n; j++) {
				pre[j] = Integer.valueOf(strArr[j]);
			}
			if (canRepresentBST(pre, n))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static boolean canRepresentBST(int pre[], int n) {
		Stack<Integer> s = new Stack<Integer>();
		int root = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (pre[i] < root) {
				return false;
			}
			while (!s.empty() && s.peek() < pre[i]) {
				root = s.peek();
				s.pop();
			}
			s.push(pre[i]);
		}
		return true;
	}
}