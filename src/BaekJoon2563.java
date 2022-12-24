import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2563 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean[][] arr = new boolean[101][101];
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int j=0; j<=10; j++) {
				arr[x+j][y+j] = true;
			}
			
//			3,7 3,8 3,9 3,10...3.17
//			4,7
		}
		
		int trueCount = 0;
		for(int i=0; i<101; i++) {
			for(int j=0; j<101; j++) {
				if(arr[i][j] == true) {
					System.out.println(i + "." + j);
					trueCount++;
				}
			}
		}
		
		System.out.println(trueCount * 10);
		
	}
}
