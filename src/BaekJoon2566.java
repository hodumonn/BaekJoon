import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int maxNum = 0;
		String numAt = "";
		
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(maxNum <= num) {
					maxNum = num;
					numAt = (i + 1) + " " + (j + 1);
				}
			}
		}
		
		System.out.println(maxNum);
		System.out.println(numAt);
	}
}
