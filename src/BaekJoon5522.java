import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 카드 게임 (https://www.acmicpc.net/problem/5522)
 * 입력 받은 점수를 모두 더해서 출력
 * @author hodu
 *
 */
public class BaekJoon5522 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = 0;
		
		for(int i=0; i<5; i++) {
			score += Integer.parseInt(br.readLine());
		}
		
		System.out.println(score);
		
		br.close();
	}
}
