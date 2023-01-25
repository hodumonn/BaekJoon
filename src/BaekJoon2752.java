import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 세수정렬 (https://www.acmicpc.net/problem/2752)
 * 숫자 세개를 입력받아 오름차순으로 정렬
 * @author hodu
 *
 */
public class BaekJoon2752 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<3; i++) {
			sb.append(arr[i] + " ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
