import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strArr = str.split(" ");

		int cnt = 0;
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i].length() > 0) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
