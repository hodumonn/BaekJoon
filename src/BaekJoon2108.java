import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BaekJoon2108 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int total = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}
		
		StringBuilder sb = new StringBuilder();
		
		//»ê¼úÆò±Õ
		int rst1 = (int)Math.round(((double)total /n));
		sb.append(rst1).append('\n');
		
		Arrays.sort(arr);
		
		//Áß¾Ó°ª
		int rst2 = arr[n/2];
		sb.append(rst2).append('\n');
		
		int[] plusArr = new int[4002];
		int[] minusArr = new int[4001];

		for(int i=0; i<n; i++) {
			if(arr[i] < 0) {
				//À½¼ö
				minusArr[Math.abs(arr[i])]++;
			} else {
				plusArr[arr[i]]++;
			}
		}
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		int maxValue = 0;
		for(int i=0; i<plusArr.length; i++) {
			maxValue = Math.max(maxValue, plusArr[i]);
		}
		
		for(int i=0; i<minusArr.length; i++) {
			maxValue = Math.max(maxValue, minusArr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i<0) {
				if(minusArr[Math.abs(i)] == maxValue) {
					arrList.add(minusArr[i]);
				}
			} else {
				if(plusArr[i] == maxValue) {
					arrList.add(plusArr[i]);
				}
			}
		}
		
		//ÃÖºó°ª
		int rst3 = 0;
		System.out.println("size:::   " + arrList.size());
		if(arrList.size() > 1) {
			rst3 = arrList.get(1);
		} else {
			rst3 = arrList.get(0);
		}
		
		sb.append(rst3).append('\n');
		
		//¹üÀ§
		int rst4 = arr[n-1] - arr[0];
		sb.append(rst4).append('\n');
		
		System.out.println(sb);
	}
}
