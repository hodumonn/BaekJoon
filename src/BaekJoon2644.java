import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 백준
 * @author hodu
 *
 */
public class BaekJoon2644 {
	static int[][] relation;
	static boolean[] visited;
	static int n, m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 전체 사람의 수
		n = Integer.parseInt(br.readLine());
		// 관계
		relation = new int[n+1][n+1];
		// 방문 여부
		visited = new boolean[n+1];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 촌수를 계산해야 하는 서로 다른 두 사람의 번호
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		// 부모 자식간의 관계 개수
		m = Integer.parseInt(br.readLine());
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			relation[x][y] = relation[y][x] = 1;
		}
		
		System.out.println(bfs(start, end));
		
		br.close();
	}

	static int bfs(int start, int end) {
		int count = 0;
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			for(int i=0; i<q.size(); i++) {
				int temp = q.poll();
				
				if(temp == end) {
					return count;
				}
				
				for(int j=1; j<=n; j++) {
					if(relation[temp][j] == 1 && !visited[j]) {
						visited[temp] = true;
						q.offer(j);
					}
				}
			}
			count++;
		}
		
		return -1;
	}
}
