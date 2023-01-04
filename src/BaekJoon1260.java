import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * ���� DFS�� BFS (https://www.acmicpc.net/problem/1260)
 * DFS�� BFS ���� ��� ���
 *
 */
public class BaekJoon1260 {
	//�湮 Ȯ�ο� �迭
	static boolean[] visited;
	//���� ����
	static int n;
	//���� ����
	static int m;
	//���� ����
	static int v;
	//�׷���
	static int[][] graph;
	//���
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		//�׷��� �迭 �ʱ�ȭ
		graph = new int[1001][1001];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int p1 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			
			graph[p1][p2] = 1;
			graph[p2][p1] = 1;
		}
		
		//�湮Ȯ�� �迭 �ʱ�ȭ
		visited = new boolean[1001];
		dfs(v);
		
		sb.append('\n');
		
		//�湮Ȯ�� �迭 �ʱ�ȭ
		visited = new boolean[1001];
		bfs();
		
		System.out.println(sb);
		br.close();
		
	}

	//���� �켱 Ž�� (���)
	static void dfs(int nodeIndex) {
		visited[nodeIndex] = true;
		sb.append(nodeIndex + " ");
		
		for(int j=1; j<=n; j++) {
			if(graph[nodeIndex][j] == 1 && !visited[j]) {
				dfs(j);
			}
		}
		
	}
	
	//���� �켱 Ž�� (ť)
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
