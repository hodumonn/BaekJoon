import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 별 찍기 (거꾸로) (https://www.acmicpc.net/problem/2440)
 * @author hodu
 *
 */
public class BaekJoon2440 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
