import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BaekJoon1181 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<String> arrList = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			if(!arrList.contains(str)) {
				arrList.add(str);
			}
		}
		
		Collections.sort(arrList, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				if(str1.length() == str2.length()) {
					return str1.compareTo(str2);
				} else {
					return str1.length() - str2.length();
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(String str : arrList) {
			sb.append(str).append('\n');
		}
		
		System.out.println(sb);
	}
}
