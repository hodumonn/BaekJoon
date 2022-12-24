import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		
		for(int i=0; i<n; i++) {
			String str = st.nextToken();
			if(map.containsKey(str)) {
				map.replace(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<m; i++) {
			String str = st.nextToken();
			
			if(map.containsKey(str)) {
				sb.append(map.get(str)).append(" ");
			} else {
				sb.append("0").append(" ");
			}
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
}
