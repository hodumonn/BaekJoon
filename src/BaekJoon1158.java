import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon1158 {
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
		
		while(!q.isEmpty()) {
			if(idx == k) {
				sb.append(q.poll());
				if(q.size() != 0) {
					sb.append(", ");
				}
				idx = 1;
			} else {
				q.offer(q.poll());
				idx++;
			}
		}
		
		sb.append(">");
		
		System.out.println(sb);
		br.close();
	}
}
