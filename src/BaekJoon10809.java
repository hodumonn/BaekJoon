import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder indexSb = new StringBuilder();
		
		String s = br.readLine();
		char[] sArr = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			sArr[i] = s.charAt(i);
		}
		
		for(int i=97; i<=122; i++) {
			int idx = -1;
			for(int j = 0; j<sArr.length; j++) {
				if((int) sArr[j] == i) {
					idx = j;
					break;
				}
			}
			indexSb.append(idx + " ");
		}
		
		System.out.println(indexSb.toString());
	}
}
