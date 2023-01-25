import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 16진수 (https://www.acmicpc.net/problem/1550)
 * 16진수 입력받아서 10진수로 출력
 * @author hodu
 *
 */
public class BaekJoon1550 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str, 16);
		
		System.out.println(n);
		
		br.close();
	}
}
