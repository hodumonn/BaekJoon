import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon2751 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			arrList.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arrList);
		
		for(int num : arrList) {
			sb.append(num).append('\n');
		}
		
		System.out.println(sb);
	}
}
