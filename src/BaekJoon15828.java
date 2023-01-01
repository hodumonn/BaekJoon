import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon15828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> buffer = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int packet = Integer.parseInt(br.readLine());
			
			if(packet == -1) break;
			
			if(packet == 0) {
				buffer.poll();
			} else {
				if(buffer.size() < n) {
					buffer.offer(packet);
				}
			}
		}
		
		if(buffer.isEmpty()) {
			sb.append("empty");
		} else {
			for(Integer b : buffer) {
				sb.append(b + " ");
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
