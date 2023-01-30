import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� ���ϱ� ����Ŭ (https://www.acmicpc.net/problem/1110)
 * N�� ����Ŭ�� ���Ͽ� ���
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
				int num1 = newNum / 10;	//�����ڸ� ��
				int num2 = newNum % 10;	//�����ڸ� ��
				
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
