package jun07;

import java.io.IOException;
import java.util.Scanner;

public class jun11654 {

	public static void main(String[] args) throws IOException {
		//���ʿ� system.in�� byte������ �����Ѱ��� �����鼭
		//�ش繮�ڿ� �����Ǵ� �ƽ�Ű�ڵ� ���� �����Ѵ�.
		//int a = System.in.read(); 
		//System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.next().charAt(0);
		// [charAt()] String ���� char ��, �� ���ڿ��� �߶� ���ڷ� ��ȯ�Ѵ�.
		//int Ÿ�� ������ ���������ν� ���ڿ� �����Ǵ� ��, �� �ƽ�Ű �ڵ尪�� �����Ѵ�.
		System.out.println(ch);
	}

}
