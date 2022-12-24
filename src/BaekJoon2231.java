import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon2231 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int rst = search(n);
		System.out.println(rst);
	}

	private static int search(int n) {
		int rst = 0;
		
		for(int i=1; i<1000000; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(i + sum == n) {
				rst = i;
				break;
			}
		}
		return rst;
	}
}
