import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = str.length();
		int digit = 1;
		
		Map<String, Integer> map = new HashMap<>();
		
		while(digit <= len) {
			for(int i=0; i+digit<=len; i++) {
				map.put(str.substring(i, i+digit), 0);
			}
			digit++;
		}
		
		System.out.println(map.size());
		
		br.close();
		
	}
}
