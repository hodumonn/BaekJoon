import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� 16���� (https://www.acmicpc.net/problem/1550)
 * 16���� �Է¹޾Ƽ� 10������ ���
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
