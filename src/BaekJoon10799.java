import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Stack<Character> stack = new Stack<>();

		int total = 0;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '(') {
				stack.push(c);
				continue;
				
			} else {
				stack.pop();
				
				if(str.charAt(i-1) == '(') {
					total += stack.size();
				} else {
					total++;
				}
			}
		}
		
		System.out.println(total);
		br.close();
	}
}
