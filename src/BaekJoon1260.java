import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 백준 DFS와 BFS (https://www.acmicpc.net/problem/1260)
 * DFS와 BFS 수행 결과 출력
 *
 */
public class BaekJoon1260 {
	//방문 확인용 배열
	static boolean[] visited;
	//정점 개수
	static int n;
	//간선 개수
	static int m;
	//시작 정점
	static int v;
	//그래프
	static int[][] graph;
	//출력
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		//그래프 배열 초기화
		graph = new int[1001][1001];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int p1 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			
			graph[p1][p2] = 1;
			graph[p2][p1] = 1;
		}
		
		//방문확인 배열 초기화
		visited = new boolean[1001];
		dfs(v);
		
		sb.append('\n');
		
		//방문확인 배열 초기화
		visited = new boolean[1001];
		bfs();
		
		System.out.println(sb);
		br.close();
		
	}

	//깊이 우선 탐색 (재귀)
	static void dfs(int nodeIndex) {
		visited[nodeIndex] = true;
		sb.append(nodeIndex + " ");
		
		for(int j=1; j<=n; j++) {
			if(graph[nodeIndex][j] == 1 && !visited[j]) {
				dfs(j);
			}
		}
		
	}
	
	//넓이 우선 탐색 (큐)
	static void bfs() {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		
		visited[v] = true;
		sb.append(v + " ");
		
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			
			for(int j=1; j<=n; j++) {
				if(graph[nodeIndex][j] == 1 && !visited[j]) {
					q.offer(j);
					visited[j] = true;
					sb.append(j + " ");
				}
			}
		}
	}

}
