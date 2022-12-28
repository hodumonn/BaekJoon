import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ���� ������(https://www.acmicpc.net/problem/13305)
 * �� ���ÿ� �ִ� �������� �⸧ ���ݰ�, �� ���ø� �����ϴ� ������ ���̸� �Է����� �޾� 
 * ���� ���� ���ÿ��� ���� ������ ���÷� �̵��ϴ� �ּ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class BaekJoon13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] distance = new long[n-1];
		long[] price = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n-1; i++) {
			distance[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			price[i] = Long.parseLong(st.nextToken());
		}
		
		long priceTotal = 0;
		long min = price[0];
		
		for(int i=0; i<distance.length; i++) {
			if(price[i] < min) {
				min = price[i];
			}
			
			priceTotal += (min * distance[i]);
		}
		
		System.out.println(priceTotal);
		
		br.close();
		
	}
}
