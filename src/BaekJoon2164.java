import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ���� ī��2 (https://www.acmicpc.net/problem/2164)
 * ī�尡 �� �� ���������� ������ ���� �۾� �ݺ�
 * �� ���� ī��� ������, �� ���� ���� ���� �ִ� ī�带 ������ �ű��
 *
 */
public class BaekJoon2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		while(q.size() != 1) {
			q.poll();
			q.offer(q.poll());
		}
		
		System.out.println(q.peek());
		
		br.close();
	}
}
