package jun07;

import java.util.Scanner;

public class jun1157_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S= sc.next();
		int[] check = new int[26]; //�빮��
		
		for(int i=0; i<S.length(); i++) {
			int ch = S.charAt(i);
			//System.out.println("ch: " + ch);
			if('a'<=ch && ch<='z') {//�ҹ���
				System.out.println("dd");
				int n = ch-'a'; //�ε����� ��´�.
				check[n]++;//
			}else {//�빮��
				System.out.println("DD");
				int n = ch-'A';
				check[n]++;
			}
		}
		
		int max=-1;
		//int num=-1;
		char ch='?';
		for(int i=0; i<check.length; i++) {
			if(max<check[i]) {
				max=check[i];
				ch = (char)(i+'A');
			}else if(max==check[i]) {
				ch='?';
			}
		}

		
		System.out.println(ch);
		
		
	}//main

}//class
