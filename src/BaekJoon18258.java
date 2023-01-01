import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *  백준 큐2 (https://www.acmicpc.net/problem/18258)
 *  큐의 명령어 처리
 *
 */
public class BaekJoon18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Deque<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			String command =  st.nextToken();
			
			switch(command) {
				case "push" : {
					int x = Integer.parseInt(st.nextToken());
					queue.offer(x);
					break;
				}
				case "pop" : {
					if(queue.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(queue.poll()).append('\n');
					}
					break;
				}
				case "size" : {
					sb.append(queue.size()).append('\n');
					break;
				}
				case "empty" : {
					if(queue.isEmpty()) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
					break;
				}
				case "front" : {
					if(queue.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(queue.peekFirst()).append('\n');
					}
					break;
				}
				case "back" : {
					if(queue.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(queue.peekLast()).append('\n');
					}
					break;
				}
			}
			
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
}
