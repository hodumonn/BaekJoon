import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon1406 {
	public static void main(String[] args) throws IOException {
//		L	Ŀ���� �������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
//		D	Ŀ���� ���������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
//		B	Ŀ�� ���ʿ� �ִ� ���ڸ� ������ (Ŀ���� ������ �� ���̸� ���õ�)
//		������ ���� Ŀ���� �� ĭ �������� �̵��� ��ó�� ��Ÿ������, 
//		������ Ŀ���� �����ʿ� �ִ� ���ڴ� �״����
//		P $	$��� ���ڸ� Ŀ�� ���ʿ� �߰���
		
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
					//Ŀ���� ������ �� ���̸� ���õ�
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
