import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� ���ϻ��� (https://www.acmicpc.net/problem/10026)
 * �׸��� �ԷµǾ����� ���ϻ����� ����� ���� ��, �ƴ� ����� ���� �� ������ �� ���
 * @author hodu
 *
 */
public class BaekJoon10026 {
	static char[][] pic;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0,};
	static int n;
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		pic = new char[n][n];
		visited = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			for(int j=0; j<n; j++) {
				pic[i][j] = str.charAt(j);
			}
		}
		
		
		//���ϻ����� �ƴ� ���
		int count = 0;
		for(int x=0; x<n; x++) {
			for(int y=0; y<n; y++) {
				if(!visited[x][y]) {
					dfs(x, y);
					count++;
				}
			}
		}
		
		sb.append(count + " ");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(pic[i][j] == 'G') {
					pic[i][j] = 'R';
				}
			}
		}
		
		//���ϻ����� ���
		count = 0;
		visited = new boolean[n][n];
		for(int x=0; x<n; x++) {
			for(int y=0; y<n; y++) {
				if(!visited[x][y]) {
					dfs(x, y);
					count++;
				}
			}
		}
		
		sb.append(count);
		
		System.out.println(sb);
		
		br.close();
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;
		
		char tempColor = pic[x][y];
		
		for(int i=0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX >= 0 && nextY>=0 && nextX < n && nextY < n) {
				if(pic[nextX][nextY] == tempColor && !visited[nextX][nextY]) {
					dfs(nextX, nextY);
				}
			}
		}
		
	}
}
