import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 연결 요소의 개수 (https://www.acmicpc.net/problem/11724)
 * 방향 없는 그래프의 연결 요소 개수를 출력 (깊이우선탐색)
 * @author hodu
 *
 */
public class BaekJoon11724 {
	static int[][] arr;
	static boolean[] visited;
	static int n;	//정점 개수
	static int m;	//간선 개수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int p1 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			
			arr[p1][p2] = arr[p2][p1] = 1;
		}
		
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		}
		
		System.out.println(count);
		
		br.close();
	}

	static void dfs(int i) {
		visited[i] = true;
		
		for(int j=1; j<=n; j++) {
			if(arr[i][j] == 1 && !visited[j]) {
				dfs(j);
			}
		}
	}
}
