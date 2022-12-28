import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * ���� ATM (https://www.acmicpc.net/problem/11399)
 * �� ����� ���� �����ϴµ� �ʿ��� �ð��� ���� �ּڰ��� ����Ѵ�.
 * 
 * ������ �߿��� �� �˰� ó���� �������� �����ϴ� 2���� �迭�� �����ߴµ�
 * ���� ���� �ʿ����� �ʾƼ� 1���� �迭�� ������
 */
public class BaekJoon11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//int[][] times = new int[n][2];
		int[] times = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
//			times[i][0] = Integer.parseInt(st.nextToken());
//			times[i][1] = i + 1;
			times[i] = Integer.parseInt(st.nextToken());
		}
		
//		Arrays.sort(times, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				return o1[0] - o2[0];
//			}
//		});
		
		Arrays.sort(times);
		
		int total = 0;
		int wait = 0;
		
		for(int i=0; i<n; i++) {
			wait += times[i];
			total += wait;
		}
		
		System.out.println(total);
		
		br.close();
	}
}
