import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int value1 = Integer.parseInt(st.nextToken());
		int value2 = Integer.parseInt(st.nextToken());
		int value3 = Integer.parseInt(st.nextToken());
		
		if(value1 != value2 && value2 != value3 && value1 != value3) {
			//��� ������ �ٸ� ��� �ִ밪�� ã�´�
			int maxValue = value1 < value2 ? value2 : value1;
			maxValue = maxValue < value3 ? value3 : maxValue;
			
			System.out.println(maxValue * 100);
			
		} else if(value1 == value2 && value2 == value3 && value1 == value3) {
			
			System.out.println(10000 + value1 * 1000);
			
		} else {
			int equalValue = 0;
			
			if(value1 == value2) {
				equalValue = value1;
			} else if(value2 == value3) {
				equalValue = value2;
			} else {
				equalValue = value1;
			}
			
			System.out.println(1000 + equalValue * 100);
			
		}
	}
}
