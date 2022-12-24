import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon1406 {
	public static void main(String[] args) throws IOException {
//		L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
//		D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
//		B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
//		삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 
//		실제로 커서의 오른쪽에 있던 문자는 그대로임
//		P $	$라는 문자를 커서 왼쪽에 추가함
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		
		String beginStr = br.readLine();
		
		for(int i=0; i<beginStr.length(); i++) {
			stack1.push(beginStr.charAt(i));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			String command = st.nextToken();
			
			switch(command) {
				case "L" :
					//커서가 문장의 맨 앞이면 무시됨
					if(!stack1.isEmpty()) {
						stack2.push(stack1.pop());
					}
					break;
					
				case "D" :
					if(!stack2.isEmpty()) {
						stack1.push(stack2.pop());
					}
					break;
					
				case "B" :
					if(!stack1.isEmpty()) {
						stack1.pop();
					}
					break;
					
				case "P" :
					char c = st.nextToken().charAt(0);
					stack1.push(c);
					break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		
		while(!stack2.isEmpty()) {
			sb.append(stack2.pop());
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
