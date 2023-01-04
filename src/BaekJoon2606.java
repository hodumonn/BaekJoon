import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 백준 바이러스 (https://www.acmicpc.net/problem/2606)
 * 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수 출력
 *
 */
public class BaekJoon2606 {
	//방문 확인
	static boolean[] visited;
	//연결 배열
	static int[][] computer;
	//컴퓨터의수
	static int computerCount;
	//네트워크 상에서 직접 연결되어 있는 컴퓨터의 쌍의 수
	static int computerLinkCount;
	//감염 개수
	static int count = 0;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		computerCount = Integer.parseInt(br.readLine());
		computerLinkCount = Integer.parseInt(br.readLine());
		
		visited = new boolean[101];
		computer = new int[101][101];
		
		for(int i=0; i<computerLinkCount; i++) {
			st = new StringTokenizer(br.readLine());
			
			int c1 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());
			
			computer[c1][c2] = computer[c2][c1] = 1;
		}
		
		bfs();
		
		System.out.println(count);
		br.close();
	}


	static void bfs() {
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		visited[1] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			
			for(int j=1; j<=computerCount; j++) {
				if(computer[temp][j] == 1 && !visited[j]) {
					q.offer(j);
					visited[j] = true;
					count++;
				}
			}
		}
		
	}
}
