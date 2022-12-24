import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon15235 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] sArr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		
		int seconds = 1;
		for(int i=1; i<=N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[j] == i) {
					sArr[j] = seconds;
				}
				if(arr[j] >= i) {
					seconds++;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			sb.append(sArr[i] + " ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
