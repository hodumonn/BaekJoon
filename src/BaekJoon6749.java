import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 Next in line (https://www.acmicpc.net/problem/6749) 
 * 다음 숫자를 출력하기
 * @author hodu
 *
 */
public class BaekJoon6749 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		System.out.println(m + (m-y));
		
		br.close();
	}
}
