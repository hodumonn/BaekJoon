import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10989 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[10001];
		
		for(int i=0; i<n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1; i<10001; i++) {
			while(arr[i] > 0) {
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		
		System.out.println(sb);
	}
}
