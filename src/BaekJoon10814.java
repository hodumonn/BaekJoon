import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon10814 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] arr1, String[] arr2) {
				if(arr1[0] == arr2[0]) {
					return 1;
				} else {
					return Integer.parseInt(arr1[0]) - Integer.parseInt(arr2[0]);
				}
			}
			
		});
		
//		for(int i=n-1; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				if(Integer.parseInt(arr[j][0]) > Integer.parseInt(arr[j+1][0])) {
//					String temp1 = arr[j][0];
//					String temp2 = arr[j][1];
//					arr[j][0] = arr[j+1][0];
//					arr[j][1] = arr[j+1][1];
//					arr[j+1][0] = temp1;
//					arr[j+1][1] = temp2;
//				}
//			}
//		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		
		System.out.println(sb);
		
	}
}
