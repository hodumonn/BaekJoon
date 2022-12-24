import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[][] arr = new boolean[n][m];
		
	
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			for(int j=0; j<m; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		int n2 = n - 7;
		int m2 = m - 7;
		
		for(int i=0; i<n2; i++) {
			for(int j=0; j<m2; j++) {
				
			}
		}
	}
}
