package jun07;

import java.util.Scanner;

public class jun2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int T= sc.nextInt(); //���̽�Ƚ��
			//int srt[] = new int[T];
			
			for (int j=0; j<T; j++) {
				
				int R = sc.nextInt(); //�ݺ�Ƚ��
				String S = sc.next(); //���ڿ� s�� �ޱ�
				
				
				for(int k=0; k<S.length(); k++) { //���ڿ����������.
					for(int i=0; i<R; i++) {	//������ ���ڿ��� R�����
					 System.out.print(S.charAt(k));
					}
				}
				
				System.out.println();
			}

	}

}
