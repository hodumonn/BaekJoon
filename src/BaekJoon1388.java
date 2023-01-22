import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1388 {
	static char[][] map;
	static boolean[][] visited;
	static int n, m;
	static int count;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());	//세로
		m = Integer.parseInt(st.nextToken());	//가로
		
		map = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		count = 0;
		
		for(int i=0; i<n; i++) {
			dfs(i, 0);
		}
		
		
		br.close();
	}

	private static void dfs(int x, int y) {
		char temp = map[x][y];
		
		for(int i=1; i<m; i++) {
			if(temp != map[x][i]) {
				count++;
			}
			
			dfs(x, i);
		}
	}
}
