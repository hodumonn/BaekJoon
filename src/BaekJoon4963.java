import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ¹éÁØ ¼¶ÀÇ °³¼ö (https://www.acmicpc.net/problem/4963)
 * ¼¶ÀÇ °³¼ö¸¦ Ãâ·Â (±íÀÌ ¿ì¼± Å½»ö)
 * @author hodu
 *
 */
public class BaekJoon4963 {
	static int[][] map;
	static boolean[][] visited;
	static int w, h;
	static int[] dx = {0, 0, -1, 1, 1, 1, -1, -1};
	static int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w == 0 || h == 0) {
				break;
			}
			
			map = new int[w][h];
			visited = new boolean[w][h];
			
			for(int i=0; i<h; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j=0; j<w; j++) {
					int p = Integer.parseInt(st.nextToken());
					
					map[j][i] = p;
				}
			}
			
			int count = 0;
			
			for(int x=0; x<w; x++) {
				for(int y=0; y<h; y++) {
					if(map[x][y] == 1 && !visited[x][y]) {
						dfs(x, y);
						count++;
					}
				}
			}
			
			sb.append(count).append('\n');
			
		}
		
		System.out.println(sb);
		
		br.close();
	}

	static void dfs(int startX, int startY) {
		visited[startX][startY] = true;
		
		for(int i=0; i<8; i++) {
			int nextX = startX + dx[i];
			int nextY = startY + dy[i];
			
			if(nextX >= 0 && nextY >= 0 && nextX < w && nextY < h) {
				if(map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
					dfs(nextX, nextY);
				}
			}
		}
	}
}
