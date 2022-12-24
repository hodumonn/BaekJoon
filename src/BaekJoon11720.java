import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hap = 0;
		
		int cnt = Integer.parseInt(br.readLine());
		String nums = br.readLine();
		
		for(int i=0; i<cnt; i++) {
			hap += nums.charAt(i) - '0';
		}
		
		System.out.println(hap);
	}
}
