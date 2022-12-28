import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * 백준 구간 합 구하기 (https://www.acmicpc.net/problem/11659)
 * 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
 *
 */
public class BaekJoon11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		arr[0] = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=n; i++) {
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int z=0; z<m; z++) {
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			sb.append(arr[j] - arr[i-1]).append('\n');
		}
		
		
		System.out.println(sb);
		
		br.close();
	}
}
