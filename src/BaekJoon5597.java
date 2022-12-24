import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaekJoon5597 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] arr = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
						"16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		
		List<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<28; i++) {
			String num = br.readLine();
			arrList.remove(num);
		}
		
		System.out.println(arrList.get(0).toString());
		System.out.println(arrList.get(1).toString());
	}
}
