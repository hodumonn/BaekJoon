import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon25304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int totalPrice = Integer.parseInt(br.readLine());
		int totalCount = Integer.parseInt(br.readLine());
		int calTotalPrice = 0;
		String calResult = "";
		
		for(int i=0; i<totalCount; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			calTotalPrice += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		}
		
		if(calTotalPrice == totalPrice) {
			calResult = "Yes";
		} else {
			calResult = "No";
		}
		
		System.out.println(calResult);
	}
}
