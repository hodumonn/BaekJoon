import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� �Ҿ���� ��ȣ(https://www.acmicpc.net/problem/1541)
 * ��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ����� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class BaekJoon1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		String[] splitMinus = str.split("-");
		int[] splitPlus = new int[splitMinus.length];
		
		for(int i=0; i<splitMinus.length; i++) {
			String[] tempArr = splitMinus[i].split("\\+");
			
			int temp = 0;
			
			for(int j=0; j<tempArr.length; j++) {
				temp += Integer.parseInt(tempArr[j]);
			}
			
			splitPlus[i] = temp;
		}
		
		int rst = 0;
		
		for(int i=0; i<splitPlus.length; i++) {
			if(i == 0) rst += splitPlus[i];
			else rst-= splitPlus[i];
		}
		
		System.out.println(rst);
		
		br.close();
	}
}
