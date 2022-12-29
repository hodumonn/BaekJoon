import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 백준 제로 (https://www.acmicpc.net/problem/10773)
 * 스택을 사용하여 최종적으로 적어 낸 수의 합을 출력
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
