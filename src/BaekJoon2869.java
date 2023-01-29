import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ���� �����̴� �ö󰡰� �ʹ� (https://www.acmicpc.net/problem/2869)
 * �����̰� Ư�� ���̿� �ö󰡴µ� ��ĥ�� �ɸ����� ���
 * @author hodu
 *
 */
public class BaekJoon2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());	//���� �ö󰡴� ����
		long b = Long.parseLong(st.nextToken());	//�㿡 �ڴ� ���� �̲������� ����
		long v = Long.parseLong(st.nextToken());	//����
		
		//�Ϸ翡 �ö󰡴� ��
		long day = a - b;
		long destination = v - b;
		
		long total = destination / day;
		
		if(destination % day != 0) {
			total++;
		}
		
		System.out.println(total);
		
		br.close();
	}
}
