import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 
 * ���� ����0 (https://www.acmicpc.net/problem/11047)
 * �ʿ��� ���� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �ʿ��� ���� ������ �ּڰ��� ����Ѵ�.
 *
 */
public class BaekJoon11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
//		Stack<Integer> stack = new Stack<Integer>();
//		
//		for(int i=0; i<n; i++) {
//			int money = Integer.parseInt(br.readLine());
//			stack.push(money);
//		}
//		
//		int count = 0;
//		
//		while(k > 0) {
//			int money = stack.pop();
//			count += k / money;
//			k = k % money;
//		}
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		
		for(int i=n-1; i>=0; i--) {
			if(k == 0) break;
			
			count += k / arr[i];
			k = k % arr[i];
		}
		
		System.out.println(count);
		
		br.close();
	}
}
