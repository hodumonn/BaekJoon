import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10807 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<cnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int chkNum = Integer.parseInt(br.readLine());
		int chkCnt = 0;
		
		for(int i=0; i<cnt; i++) {
			if(arr[i] == chkNum)
				chkCnt++;
		}
		
		System.out.println(chkCnt);
	}
}
