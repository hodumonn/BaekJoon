import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon9012 {
	//	출력은 표준 출력을 사용한다. 
	//	만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 
	//	한 줄에 하나씩 차례대로 출력해야 한다. 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String rst = isVps(br.readLine());
			sb.append(rst).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}

	private static String isVps(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			} else {
				if(stack.size() == 0) {
					return "NO";
				} else {
					stack.pop();
				}
			}
		}
		
		if(stack.size() > 0) {
			return "NO";
		}
		
		return "YES";
	}

}
