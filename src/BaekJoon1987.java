import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 알파벳 (https://www.acmicpc.net/problem/1987)
 * 같은 알파벳이 적힌 칸을 두 번 지날 수 없을 때 말이 지날 수 있는 최대의 칸 수 출력
 * @author hodu
 *
 */
public class BaekJoon1987 {
	static char[][] board;
	static boolean[][] visited;
	static int r, c, max;	//세로, 가로, 최대
	static int count;
	static boolean[] alphabet = new boolean[26];
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		board = new char[r][c];
		visited = new boolean[r][c];
		
		for(int i=0; i<r; i++) {
			String str = br.readLine();
			
			for(int j=0; j<c; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		
		max = Integer.MIN_VALUE;
		count = 1;
		dfs(0, 0);
		
		System.out.println(max);
		
		br.close();
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;
		alphabet[board[x][y] - 65] = true;
		
		for(int i=0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX >= 0 && nextY >= 0 && nextX < r && nextY < c) {
				char nextTemp = board[nextX][nextY];
				
				if(!visited[nextX][nextY] && !alphabet[nextTemp - 65]) {
					count++;
					dfs(nextX, nextY);
				}
			}
		}
		
		max = max < count ? count : max;
		count--;
		visited[x][y] = false;
		alphabet[board[x][y] - 65] = false;
		
	}
}
