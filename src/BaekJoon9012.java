import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon9012 {
	//	����� ǥ�� ����� ����Ѵ�. 
	//	���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� 
	//	�� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
	
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
