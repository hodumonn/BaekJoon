import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 주유소(https://www.acmicpc.net/problem/13305)
 * 각 도시에 있는 주유소의 기름 가격과, 각 도시를 연결하는 도로의 길이를 입력으로 받아 
 * 제일 왼쪽 도시에서 제일 오른쪽 도시로 이동하는 최소의 비용을 계산하는 프로그램을 작성하시오.
 *
 */
public class BaekJoon13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] distance = new long[n-1];
		long[] price = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n-1; i++) {
			distance[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			price[i] = Long.parseLong(st.nextToken());
		}
		
		long priceTotal = 0;
		long min = price[0];
		
		for(int i=0; i<distance.length; i++) {
			if(price[i] < min) {
				min = price[i];
			}
			
			priceTotal += (min * distance[i]);
		}
		
		System.out.println(priceTotal);
		
		br.close();
		
	}
}
