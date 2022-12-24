import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			min = num < min ? num : min;
			max = num > max ? num : max;
		}
		
		System.out.println(min * max);
		
		br.close();
	}
}
