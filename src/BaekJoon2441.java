import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 오른쪽을 기준으로 정렬한 별 찍기 (https://www.acmicpc.net/problem/2441)
 * @author hodu
 *
 */
public class BaekJoon2441 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			for(int j=n-i; j<n; j++) {
				sb.append(" ");
			}
			
			for(int k=0; k<n-i; k++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
