package jun07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jun2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//reverse()�޼ҵ�� ����� ���ڿ��� �����´�.
		//�׸��� StringBuilderŸ���� ���ڿ��� ��ȯ ��Ű�� ���� toString()�� ���ش�.
		//�۰� ���ڿ��� ��ȯ��Ų�� integer.parselint()�� String->intŸ������ ����
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
	
		System.out.println(A>B ? A : B);
	}

}
