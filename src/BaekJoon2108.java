import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ���� ����� (https://www.acmicpc.net/problem/2108)
 * 
 * ù° �ٿ��� �������� ����Ѵ�. �Ҽ��� ���� ù° �ڸ����� �ݿø��� ���� ����Ѵ�.
 * ��° �ٿ��� �߾Ӱ��� ����Ѵ�.
 * ��° �ٿ��� �ֺ��� ����Ѵ�. ���� �� ���� ������ �ֺ� �� �� ��°�� ���� ���� ����Ѵ�.
 * ��° �ٿ��� ������ ����Ѵ�.
 *
 */
public class BaekJoon2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] plusArr = new int[4002];
		int[] minusArr = new int[4001];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] >= 0) {
				plusArr[arr[i]]++;
			} else {
				minusArr[-arr[i]]++;
			}
			sum += arr[i];
		}
		
		//1. ������
		sb.append((int)Math.round(((double)sum /n))).append('\n');
		
		Arrays.sort(arr);
		
		//2. �߾Ӱ�
		sb.append(arr[n/2]).append('\n');
		
		//3. �ֺ�
		int max = Integer.MIN_VALUE;
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<plusArr.length; i++) {
			if(max < plusArr[i]) {
				list.clear();
				max = plusArr[i];
				list.add(i);
			} else if(max == plusArr[i]) {
				list.add(i);
			}
		}
		
		for(int i=0; i<minusArr.length; i++) {
			if(max < minusArr[i]) {
				list.clear();
				max = minusArr[i];
				list.add(-(i));
			} else if(max == minusArr[i]) {
				list.add(-(i));
			}
		}
		
		if(list.size() == 1) {
			sb.append(list.get(0)).append('\n');
		} else if(list.size() > 1){
			Collections.sort(list);
			sb.append(list.get(1)).append('\n');
		} else {
			sb.append('\n');
		}
		
		//4. ����
		sb.append(arr[n-1] - arr[0]);
		
		System.out.println(sb);
		
		br.close();
		
	}
}
