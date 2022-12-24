import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//String[] time = st.nextToken().split(" ");
		int startHour = Integer.parseInt(st.nextToken());
		int startMinute = Integer.parseInt(st.nextToken());
		
		//st = new StringTokenizer(br.readLine());
		
		int cookTime = Integer.parseInt(br.readLine());
		
		int endMinute = cookTime + startMinute;
		int endHour = startHour + (endMinute / 60);
		endMinute = endMinute % 60;
		
		System.out.println(endHour % 24 + " " + endMinute);
	}
}
