import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ���� ������ȣ���̱� (https://www.acmicpc.net/problem/2667)
 * ���簢�� ����� ������ ������ ���� ���
 *
 */
public class BaekJoon2667 {
	//������
	static int n;
	//�湮 ����
	static boolean[][] visited;
	//�����迭
	static int[][] house;
	//x��ǥ
	static int[] dx = {0, 0, -1, 1};
	//y��ǥ
	static int[] dy = {1, -1, 0, 0};
	//���
	StringBuilder sb = new StringBuilder();
	
	static int count;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> result = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n][n];
		house = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				house[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(house[i][j] == 1 && !visited[i][j]) {
					count = 1;
					result.add(solve(i,j));
				}
			}
		}
		
		Collections.sort(result);
		
		sb.append(result.size()).append('\n');
		
		for(Integer i : result) {
			sb.append(i).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
		
	}


	static int solve(int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nowX = x + dx[i];
			int nowY = y + dy[i];
			
			if(nowX >= 0 && nowY >= 0 && nowX < n && nowY < n) {
				if(house[nowX][nowY] == 1 &&!visited[nowX][nowY]) {
					solve(nowX, nowY);
					count += 1;
				}
			}
		}
		return count;
	}
}
