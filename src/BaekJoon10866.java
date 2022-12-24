import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> dq = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String command = st.nextToken();
			
			switch(command) {
				case "push_front" :
					dq.addFirst(Integer.parseInt(st.nextToken()));
					break;
					
				case "push_back" :
					dq.addLast(Integer.parseInt(st.nextToken()));
					break;
					
				case "pop_front" :
					if(!dq.isEmpty()) {
						sb.append(dq.pollFirst()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					
					break;
				case "pop_back" :
					if(!dq.isEmpty()) {
						sb.append(dq.pollLast()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					
					break;
				case "size" :
					sb.append(dq.size()).append('\n');
					
					break;
				case "empty" :
					if(!dq.isEmpty()) {
						sb.append(0).append('\n');
					} else {
						sb.append(1).append('\n');
					}
					
					break;
				case "front" :
					if(!dq.isEmpty()) {
						sb.append(dq.peekFirst()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					
					break;
				case "back" :
					if(!dq.isEmpty()) {
						sb.append(dq.peekLast()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					
					break;
				
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
