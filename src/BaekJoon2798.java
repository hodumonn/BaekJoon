import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2798 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int rst = search(arr, n, m);
		
		System.out.println(rst);
	}

	private static int search(int[] arr, int n, int m) {
		int rst = 0;
		
		for(int i=0; i<n-2; i++) {
			
			for(int j=i+1; j<n-1; j++) {
				
				for(int z=j+1; z<n; z++) {
					int temp = arr[i] + arr[j] + arr[z];
					
					if(temp == m) {
						return temp;
					}
					
					if(rst < temp && temp < m) {
						rst = temp; 
					}
				}
				
				
			}
		}
		
		return rst;
	}
}
