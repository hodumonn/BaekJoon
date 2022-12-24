import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon18870 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[n];
		Integer[] arr2 = new Integer[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[i] = arr[i];
		}
		
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer arr1, Integer arr2) {
				if(arr1 > arr2) {
					return arr1 - arr2;
				} else {
					return -1;
				}
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
		
		int idx = 0;
		
		for(int i=0; i<n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], idx);
				idx++;
			}
		}
		
		for(int i=0; i<n; i++) {
			sb.append(map.get(arr2[i]) + " ");
		}
		
		System.out.println(sb);
	}
}
