import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			map.put(br.readLine(), 0);
		}

		List<String> mList = new ArrayList<>();
		
		for(int i=0; i<m; i++) {
			String str = br.readLine();
			
			if(map.containsKey(str)) {
				mList.add(str);
			}
		}
		
		Collections.sort(mList);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(mList.size()).append('\n');
		
		for(String str : mList) {
			sb.append(str).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
}
