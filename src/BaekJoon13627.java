import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon13627 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		if(n == r) {
			System.out.println("*");
		} else {
			int[] arr = new int[n+1];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<r; i++) {
				arr[Integer.parseInt(st.nextToken())]++;
			}
			
			StringBuilder sb = new StringBuilder();
			
			
			for(int i=1; i<=n; i++) {
				if(arr[i] == 0) {
					sb.append(i + " ");
				}
			}
			
			System.out.println(sb);
		}
		
		br.close();
	}
}
