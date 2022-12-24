import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BaekJoon11654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte[] ascii = br.readLine().getBytes(StandardCharsets.US_ASCII);
		System.out.println(ascii[0]);
	}
}
