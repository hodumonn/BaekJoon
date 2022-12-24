import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		int back = -1;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch(command) {
				case "push" :
					int num = Integer.parseInt(st.nextToken());
					queue.offer(num);
					back = num;
					break;
					
				case "pop" :
					if(!queue.isEmpty()) {
						sb.append(queue.poll()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					break;
					
				case "size" :
					sb.append(queue.size()).append('\n');
					break;
					
				case "empty" :
					if(!queue.isEmpty()) {
						sb.append(0).append('\n');
					} else {
						sb.append(1).append('\n');
					}
					break;
					
				case "front" :
					if(!queue.isEmpty()) {
						sb.append(queue.peek()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					break;
					
				case "back" :
					if(!queue.isEmpty()) {
						sb.append(back).append('\n');
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
