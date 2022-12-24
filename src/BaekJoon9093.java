import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon9093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String inputStr = br.readLine();
			
			Stack<Character> stack = new Stack<Character>();
			
			for(int j=0; j<inputStr.length(); j++ ) {
				
				char c = inputStr.charAt(j);
				
				if(c == ' ') {
					int size = stack.size();
					
					if(size > 0) {
						for(int z=0; z<size; z++) {
							sb.append(stack.pop());
						}
						sb.append(c);
					}
				} else {
				
					stack.push(c);
				}
			}
			int size = stack.size();
			
			if(size > 0) {
				for(int z=0; z<size; z++) {
					sb.append(stack.pop());
				}
			}
			
			sb.append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
