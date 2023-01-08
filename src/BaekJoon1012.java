import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ���� ����� ���� (https://www.acmicpc.net/problem/1012)
 * ���߹翡�� �ʿ��� �ּ��� ������������ ���� ���� ���
 *
 */
public class BaekJoon1012 {
	static int t, m, n, k;	//�׽�Ʈ ���̽�, ����, ����, ���߰� �ɾ��� ����
	static int[][] area;	//���߹�
	static boolean[][] visited;	//�湮 üũ
	
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
		
		int[] dx = {0, 0, -1, 1};	//�����¿�
		int[] dy = {1, -1, 0, 0};	//�����¿�
		
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
