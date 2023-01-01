import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 백준 요세푸스 문제 0 (https://www.acmicpc.net/problem/11866)
 * 큐를 이용하여 제거 과정을 구현
 *
 */
public class BaekJoon11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		int idx = 1;
		
		sb.append("<");
		
		while(q.size() != 1) {
			if(idx % k == 0) {
				sb.append(q.poll() + ", ");
			} else {
				q.offer(q.poll());
			}
			idx++;
		}
		
		sb.append(q.poll() + ">");
		
		System.out.println(sb);
		
		br.close();
		
	}
}
