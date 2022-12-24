import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] inputNum = new int[2];
		int num = Integer.parseInt(br.readLine());
		int calNum = 0;
		int calCnt = 0;
		
		if(num < 10) {
			inputNum[0] = 0;
			inputNum[1] = num;
		} else {
			inputNum[0] = (int) Integer.toString(num).charAt(0);
			inputNum[1] = (int) Integer.toString(num).charAt(1);
			System.out.println(Integer.toString(num).charAt(0));
			System.out.println(Integer.toString(num).charAt(1));
		}
		
//		while(true) {
		for(int i=0; i<5; i++) {
			calCnt++;
			
			calNum = (int) inputNum[0] + inputNum[1];
			System.out.println(i + "   " + calNum);
			inputNum[0] = inputNum[1];
			inputNum[1] = Integer.toString(num).charAt(1);
			
			if(calNum == num) {
				break;
			}
		}
		System.out.println(calCnt);
	}
}
