import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 부녀회장이 될테야 (https://www.acmicpc.net/problem/2775)
 * 입력된 층, 호에 몇명이 살고있는지 출력
 * @author hodu
 *
 */
public class BaekJoon2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[15][15];
		
		for(int i=0; i<15; i++) {
			arr[0][i] = i;
			arr[i][1] = 1;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			
			sb.append(arr[x][y]).append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
