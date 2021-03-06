/**
 * 
 */
package companies.delhivery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rahul
 *
 */
public class Sol1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = 0;
		try {
			String output = "";
			N = Integer.valueOf(br.readLine());
			String s = br.readLine();
			String[] sArr = s.split(" ");
			int arr[] = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.valueOf(sArr[i]);
			}
			
			int revArr[] = new int[N];
			for (int i = 0; i < N; i++) {
				int num = arr[i];
				int revNum = 0;
				while(num > 0) {
					revNum = (revNum*10) + num%10;
					num = num/10;
				}
				revArr[i] = revNum;
			}
			boolean done = false;
			while(!done) {
				int maxIdx = 0;
				int checker = 1;
				boolean checked = false;
				while(!checked) {
					checker *= 10;
					int max = 0;
					for (int i = 0; i < N; i++) {
						done = true;
						checked = true;
						
						if(revArr[i] != 0) {
							if(revArr[i]%checker == max) {
								checked = false;
							}
							if(revArr[i]%checker > max) {
								max = revArr[i]%checker;
								maxIdx = i;
								checked = true;
								done = false;
							}
						}
					}
				}
				
				revArr[maxIdx] = 0;
				output += arr[maxIdx];
			}

			System.out.println(output);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
