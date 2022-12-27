import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		long min = 1;
		long max = 0;
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			if(max < num) max = num;
		}
		
		long cm = binarySearch(arr, K, min, max);
		
		System.out.println(cm - 1);
		
		br.close();
	}

	private static long binarySearch(int[] arr, int K, long min, long max) {
		long mid = 0;
		
		while(min <= max) {
			mid = (min + max) / 2;
			long total = 0;
			
			for(int i=0; i<arr.length; i++) {
				total += arr[i] / mid;
			}
			
			if(total >= K) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		return min;
	}
}
