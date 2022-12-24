import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10872 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int rst = factorial(n);
		System.out.println(rst);
	}
	
	public static int factorial(int n) {
		if(n <= 1)
			return 1;
		
		return n * factorial (n - 1);
	}
}
