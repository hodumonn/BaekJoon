import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 백준 카드2 (https://www.acmicpc.net/problem/2164)
 * 카드가 한 장 남을때까지 다음과 같은 작업 반복
 * 맨 위에 카드는 버리고, 그 다음 제일 위에 있는 카드를 밑으로 옮긴다
 *
 */
public class BaekJoon2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		while(q.size() != 1) {
			q.poll();
			q.offer(q.poll());
		}
		
		System.out.println(q.peek());
		
		br.close();
	}
}
