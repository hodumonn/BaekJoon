import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 유기농 배추 (https://www.acmicpc.net/problem/1012)
 * 배추밭에서 필요한 최소한 배추흰지렁이 마리 수를 출력
 *
 */
public class BaekJoon1012 {
	static int t, m, n, k;	//테스트 케이스, 가로, 세로, 배추가 심어진 개수
	static int[][] area;	//배추밭
	static boolean[][] visited;	//방문 체크
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			area = new int[m][n];
			visited = new boolean[m][n];
			
			for(int j=0; j<k; j++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				area[x][y] = 1;
			}
			int count = 0;
			
			for(int x=0; x<m; x++) {
				for(int y=0; y<n; y++) {
					if(area[x][y] == 1 && !visited[x][y]) {
						getCount(x, y);
						count++;
					}
				}
			}

			sb.append(count).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}

	static void getCount(int x, int y) {
		visited[x][y] = true;
		
		int[] dx = {0, 0, -1, 1};	//상하좌우
		int[] dy = {1, -1, 0, 0};	//상하좌우
		
		for(int i=0; i<4; i++) {
			int nowX = x + dx[i];
			int nowY = y + dy[i];
			
			if(nowX >= 0 && nowY >= 0 && nowX < m && nowY < n) {
				if(area[nowX][nowY] == 1 && !visited[nowX][nowY]) {
					getCount(nowX, nowY);
				}
			}
		}
	}
	
}
