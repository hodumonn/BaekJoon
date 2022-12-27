import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[N];
		
		long min = 1;
		long max = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		
		long cm = binarySearch(arr, M, min, max);
		
		System.out.println(cm - 1);
		
		br.close();
	}

	private static long binarySearch(long[] arr, int M, long min, long max) {
		long mid = 0;
		
		while(min <= max) {
			long total = 0;
			mid = (min + max) / 2;
			
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] > mid) {
					total += arr[i] - mid;
				}
			}
			
			if(total >= M) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		
		return min;
	}
}
