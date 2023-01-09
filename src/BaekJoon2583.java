import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 백준 영역 구하기 (https://www.acmicpc.net/problem/2583)
 * 분리 영역을 구하여 오름차순으로 출력
 * @author hodu
 *
 */
public class BaekJoon2583 {
	static int[][] map;
	static int m, n, k;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		map = new int[m][n];
		
		for(int i=0; i<k; i++) {
			String[] temp = br.readLine().split(" ");
			
			// x,y의 좌표를 뒤집어야 한다. 왼쪽 위, 오른쪽 아래
			int y1 = Integer.parseInt(temp[0]);
			int x1 = Integer.parseInt(temp[1]);
			int y2 = Integer.parseInt(temp[2]);
			int x2 = Integer.parseInt(temp[3]);
			
			for(int j=x1; j<x2; j++) {
				for(int z=y1; z<y2; z++) {
					map[j][z] = 1;
				}
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 0) {
					count = 0;
					dfs(i, j);
					list.add(count);
				}
			}
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append('\n');
		
		for(Integer i : list) {
			sb.append(i + " ");
		}
		
		System.out.println(sb);
		
		br.close();
		
	}

	static void dfs(int x, int y) {
		map[x][y] = 1;
		count++;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < m && ny < n) {
				if(map[nx][ny] == 0) {
					dfs(nx, ny);
				}
			}
		}
	}
}
