import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 백준 네 개의 소수 (https://www.acmicpc.net/problem/1153)
 * @author hodu
 *
 */
public class BaekJoon1153 {
	static int[] arr = new int[10000001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		setPrime();
		
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		if(n < 8) {
			sb.append("-1");
		} else {
			if(n % 2 == 1) {
				list.add(2);
				list.add(3);
				list.addAll(goldBach(n-5));
			} else {
				list.add(2);
				list.add(2);
				list.addAll(goldBach(n-4));
			}
		}
		
		Collections.sort(list);
		for(int i : list) {
			sb.append(i + " ");
		}
		
		System.out.println(sb);
		
		br.close();
		
	}

	public static ArrayList<Integer> goldBach(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=2; i<=num/2; i++) {
			if(arr[i] == 0 && arr[num-i] == 0) {
				list.add(i);
				list.add(num-i);
				break;
			}
		}
		return list;
	}

	public static void setPrime() {
		for(int i=2; i*i<=1000000; i++) {
			for(int j=i*i; j<=1000000; j+=i) {
				arr[j] = -1;
			}
		}
		
	}
}
