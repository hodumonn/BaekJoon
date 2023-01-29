import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 ACM 호텔 (https://www.acmicpc.net/problem/10250)
 * 방 배정하여 출력
 * @author hodu
 *
 */
public class BaekJoon10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int floor;
			int room;
			
			if(n % h == 0) {
				floor = h;
				room = n / h;
			} else {
				floor =  n % h;
				room = n / h + 1;
			}
			
			sb.append(floor);
			
			if(room < 10) {
				sb.append("0" + room);
			} else {
				sb.append(room);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
