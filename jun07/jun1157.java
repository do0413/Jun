package jun07;

import java.util.Scanner;

public class jun1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int count[] = new int[26]; //���ĺ� ������ ī��Ʈ
		
		
		for(int i=0;i<S.length(); i++) {
			//count[i] = S.charAt(i);//�ƽ�Ű �ڵ带 �޴´�.	
			
			if('A'<=S.charAt(i) && S.charAt(i)<='Z') {
				count[ S.charAt(i)-65]++;//�ҹ���
			} else {
				count[S.charAt(i)-97]++;//�빮��
			}	
		}
		
		
		
		int max=-1;
		char ch='?';
		

		for(int j=0; j<26; j++) {
			
			if(count[j]>max) {
				max=count[j];
				ch = (char) (j+65); //�빮�ڷ� ���
			} 
			else if (count[j] == max) {
				ch = '?';
			}
		}

			System.out.println(ch);
		
	}

}
