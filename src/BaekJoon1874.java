import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon1874 {
	//	�Էµ� ������ ����� ���� �ʿ��� ������ �� �ٿ� �� ���� ����Ѵ�. 
	//	push������ +��, pop ������ -�� ǥ���ϵ��� �Ѵ�. 
	//	�Ұ����� ��� NO�� ����Ѵ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		StringBuilder sb = progression(n, arr);
		
		System.out.println(sb);
		br.close();
	}

	private static StringBuilder progression(int n, int[] arr) {
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int idx = 0;
		
		
		for(int i=1; i<=n; i++) {
			stack.push(i);
			sb.append("+").append('\n');
			
			while(idx < n) {
				if(!stack.isEmpty()) {
					if(arr[idx] == stack.peek()) {
						stack.pop();
						sb.append("-").append('\n');
						idx++;
					} else {
						break;
					}
				} else {
					break;
				}
			}
		}
		
		
		if(!stack.isEmpty()) {
			sb.setLength(0);
			sb.append("NO");
		}
		
		return sb;
	}
}
