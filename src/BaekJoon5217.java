import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 쌍의 합 (https://www.acmicpc.net/problem/5217)
 * 입력 받은 값을 만드는 쌍을 사전순으로 출력
 * @author hodu
 *
 */
public class BaekJoon5217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append("Pairs for ").append(n).append(":");
			
			int count = 0;
			
			for(int j=1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					if(j<k && j!=k && j+k==n) {
						if(count > 0) {
							sb.append(", ").append(j).append(" ").append(k);
						} else {
							sb.append(" ").append(j).append(" ").append(k);
						}
						count++;
					}
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
