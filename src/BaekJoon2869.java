import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 달팽이는 올라가고 싶다 (https://www.acmicpc.net/problem/2869)
 * 달팽이가 특정 높이에 올라가는데 며칠이 걸리는지 출력
 * @author hodu
 *
 */
public class BaekJoon2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());	//낮에 올라가는 높이
		long b = Long.parseLong(st.nextToken());	//밤에 자는 동안 미끄러지는 높이
		long v = Long.parseLong(st.nextToken());	//높이
		
		//하루에 올라가는 양
		long day = a - b;
		long destination = v - b;
		
		long total = destination / day;
		
		if(destination % day != 0) {
			total++;
		}
		
		System.out.println(total);
		
		br.close();
	}
}
