import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0; i<cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int repeatCnt = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int j=0; j<s.length(); j++) {
				for(int z=0; z<repeatCnt; z++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
