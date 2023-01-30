import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 직사각형에서 탈출 (https://www.acmicpc.net/problem/1085)
 * 현재 좌표에서 직사각형의 경계선까지의 가는 거리의 최솟값
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
