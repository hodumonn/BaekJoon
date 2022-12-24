import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class BaekJoon1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int aCnt = Integer.parseInt(st.nextToken());
		int bCnt = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> aMap = new HashMap<>();
		Map<Integer, Integer> bMap = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<aCnt; i++) {
			aMap.put(Integer.parseInt(st.nextToken()), 0);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<bCnt; i++) {
			bMap.put(Integer.parseInt(st.nextToken()), 0);
		}

		int aCha = aMap.size();
		int bCha = bMap.size();
		
		for(Integer key : aMap.keySet()) {
			if(bMap.containsKey(key)) aCha--;
		}
		
		for(Integer key : bMap.keySet()) {
			if(aMap.containsKey(key)) bCha--;
		}
		
		System.out.println(aCha + bCha);
		
		br.close();
	}
}
