import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 열 개씩 끊어 출력하기 (https://www.acmicpc.net/problem/11721)
 * @author hodu
 *
 */
public class BaekJoon11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		int cnt = 1;
		
		for(int i=0; i<str.length(); i++) {
			sb.append(str.charAt(i));
			
			if(cnt % 10 == 0) {
				sb.append('\n');
			}
			cnt++;
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
