package jun07;

import java.util.Scanner;

public class jun10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int check[] = new int[26]; //���ĺ� ������ġ ����üũ
		
		for(int i =0; i<check.length; i++) {
			check[i] = -1; //���� -1�� �ʱ�ȭ�� ��Ų��.
		}
		
		
		String S = sc.nextLine();
		
		for(int i =0 ; i<S.length(); i++ ) {
			char ch = S.charAt(i);//�� ���ڸ� �ƽ�Ű �ڵ�� ��´�.
			
			if(check[ch-'a'] == -1) {
				check[ch-'a'] =i;//����-�ε��� �� �����Ͽ� ������ �ִ�.
			}
		}
		
		for(int value : check) {
			System.out.print(value + " ");
		}
		

	}

}
