import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 최대공약수(https://www.acmicpc.net/problem/1850)
 * @author hodu
 *
 */
public class BaekJoon1850 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long gcd = getGcd(Math.max(a, b), Math.min(a, b));
		
		StringBuilder sb = new StringBuilder();
		
		for(long i=0; i<gcd; i++) {
			sb.append(1);
		}
		
		System.out.println(sb);
		
		br.close();
	}

	static long getGcd(long a, long b) {
		if(a%b == 0) {
			return b;
		}
		
		return getGcd(b, a%b);
		
	}
}
