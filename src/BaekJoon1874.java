import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon1874 {
	//	입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. 
	//	push연산은 +로, pop 연산은 -로 표현하도록 한다. 
	//	불가능한 경우 NO를 출력한다.
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
