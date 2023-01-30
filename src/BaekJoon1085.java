import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * ���� ���簢������ Ż�� (https://www.acmicpc.net/problem/1085)
 * ���� ��ǥ���� ���簢���� ��輱������ ���� �Ÿ��� �ּڰ�
 * @author hodu
 *
 */
public class BaekJoon1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = y;
		arr[2] = w-x;
		arr[3] = h-y;
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		
		br.close();
	}
}
