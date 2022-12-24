import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> nameMap = new HashMap<>();
		Map<Integer, String> seqMap = new HashMap<>();
		
		for(int i=1; i<=n; i++) {
			String name = br.readLine();
			nameMap.put(name, i);
			seqMap.put(i, name);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<m; i++) {
			String str = br.readLine();
			if(str.chars().allMatch(Character::isDigit)) {
				//숫자일때
				sb.append(seqMap.get(Integer.parseInt(str))).append('\n');
			} else {
				sb.append(nameMap.get(str)).append('\n');
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
