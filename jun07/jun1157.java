package jun07;

import java.util.Scanner;

public class jun1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int count[] = new int[26]; //알파벳 개수를 카운트
		
		
		for(int i=0;i<S.length(); i++) {
			//count[i] = S.charAt(i);//아스키 코드를 받는다.	
			
			if('A'<=S.charAt(i) && S.charAt(i)<='Z') {
				count[ S.charAt(i)-65]++;//소문자
			} else {
				count[S.charAt(i)-97]++;//대문자
			}	
		}
		
		
		
		int max=-1;
		char ch='?';
		

		for(int j=0; j<26; j++) {
			
			if(count[j]>max) {
				max=count[j];
				ch = (char) (j+65); //대문자로 출력
			} 
			else if (count[j] == max) {
				ch = '?';
			}
		}

			System.out.println(ch);
		
	}

}
