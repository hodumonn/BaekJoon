import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 더하기 사이클 (https://www.acmicpc.net/problem/1110)
 * N의 사이클을 구하여 출력
 * @author hodu
 *
 */
public class BaekJoon1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int newNum = n;
		int count = 0;
		
		
		while(true) {
			
			if(count > 0) {
				if(n == newNum) break;
			}
			
			count++;
			
			if(newNum >= 10) {
				int num1 = newNum / 10;	//십의자리 수
				int num2 = newNum % 10;	//일의자리 수
				
				int sum = num1 + num2;
				newNum = num2 * 10 + sum % 10;
			} else {
				newNum = newNum * 10 + newNum;
			}
			
		}
		
		System.out.println(count);
		
		br.close();
		
	}
}
