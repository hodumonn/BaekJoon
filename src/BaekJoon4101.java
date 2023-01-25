import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ���� ũ��? (https://www.acmicpc.net/problem/4101)
 * ù ��° ���� �� ���� ������ ū�� ���
 * @author hodu
 *
 */
public class BaekJoon4101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			
			sb.append(num1 > num2 ? "Yes" : "No").append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
