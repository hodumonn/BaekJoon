import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		long num1 = 1;
		long num2 = 1;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			num1 *= Long.parseLong(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<m; i++) {
			num2  *= Long.parseLong(st.nextToken());
		}
		
		System.out.println(num2);
		
		long gcd = getGcd(Math.max(num1, num2), Math.min(num1, num2));
		
		
		br.close();
	}

	static long getGcd(long num1, long num2) {
		if(num1 % num2 == 0) {
			return num2;
		}
		
		return getGcd(num2, num1 % num2);
	}
}
