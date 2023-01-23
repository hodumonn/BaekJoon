import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 입력된 날짜는 무슨 요일일까? (https://www.acmicpc.net/problem/1924)
 * @author hodu
 *
 */
public class BaekJoon1924 {
	static String[] months = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Integer x = Integer.parseInt(st.nextToken());
		Integer y = Integer.parseInt(st.nextToken());
		
		int day = 0;
		
		for(int i=0; i<x-1; i++) {
			day += days[i];
		}
		
		day += y;
		
		day %= 7;
		
		System.out.println(months[day]);
		
		br.close();
	}
}
