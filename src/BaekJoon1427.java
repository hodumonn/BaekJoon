import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1427 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int[] arr = new int[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=arr.length-1; i>=0; i--) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb);
		
//		int[] arr = new int[str.length()];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = Integer.parseInt(str.substring(i, i+1));
//		}
//		
//		Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//		Arrays.sort(arrInteger, Collections.reverseOrder());
//		
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0; i<arrInteger.length; i++) {
//			sb.append(arrInteger[i]);
//		}
//		
//		System.out.println(sb);
	}
}
