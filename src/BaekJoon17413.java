import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		
		String str = br.readLine();
		boolean isTag = false;
		
		for(int i=0; i<str.length(); i++) {
			
			char c = str.charAt(i);
			
			if(c == '<') {
				isTag = true;
				getAllStack(sb, stack);
				sb.append('<');
				
			} else if(c == '>') {
				isTag = false;
				sb.append('>');
				getAllStack(sb, stack);
				
			} else if(isTag) {
				sb.append(c);
			} else if(!isTag) {
				if(c == ' ') {
					getAllStack(sb, stack);
					sb.append(' ');
					
				} else {
					stack.add(c);
				}
			}
		}
		getAllStack(sb, stack);
		
		System.out.println(sb);
		br.close();
	}

	private static void getAllStack(StringBuilder sb, Stack<Character> stack) {
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
	}
}
