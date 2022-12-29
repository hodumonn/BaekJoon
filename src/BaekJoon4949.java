import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 백준 균형잡힌 세상 (https://www.acmicpc.net/problem/4949)
 * 문자열 영문 알파벳, 공백, 소괄호("( )") 대괄호("[ ]")이 균형을 이루는지 출력
 *
 */
public class BaekJoon4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals(".") && str.length() == 1) {
				break;
			}
			
			sb.append(solve(str)).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}

	private static String solve(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '(' || c == '[') {
				stack.push(c);
			} else if(c == ')') {
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if(c == ']') {
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
