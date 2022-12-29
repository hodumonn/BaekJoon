import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * ���� ���� (https://www.acmicpc.net/problem/10773)
 * ������ ����Ͽ� ���������� ���� �� ���� ���� ���
 *
 */
public class BaekJoon10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<k; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(num);
			}
		}
		
		int rst = 0;
		while(!stack.isEmpty()) {
			rst += stack.pop();
		}
		
		System.out.println(rst);
		
		br.close();
	}
}
