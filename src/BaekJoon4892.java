import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� ���� ���߱� ���� (https://www.acmicpc.net/problem/4892)
 * ģ���� �����ϴ� ���� ���߱�
 * @author hodu
 *
 */
public class BaekJoon4892 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int idx = 1;
		
		while(true) {
			int n0 = Integer.parseInt(br.readLine());
			
			if(n0 == 0) break;
			
			//1) n1 = 3 * n0
			int n1 = 3 * n0;
			
			sb.append(idx).append(". ");
			sb.append(n1 % 2 == 0 ? "even " : "odd ");
			
			//2) n1�� ¦����� n2 = n1 / 2
			//	 n1�� Ȧ����� n2 = (n1 + 1) / 2
			if(n1 % 2 == 1) n1 += 1;
			int n2 = n1 / 2;
			
			//3) n3 = 3 * n2
			int n3 = 3 * n2;
			
			//n4 = n3 / 9
			int n4 = n3 / 9;
			
			sb.append(n4);
			sb.append('\n');
			
			idx++;
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
}
