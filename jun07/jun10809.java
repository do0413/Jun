package jun07;

import java.util.Scanner;

public class jun10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int check[] = new int[26]; //알파벳 문자위치 유무체크
		
		for(int i =0; i<check.length; i++) {
			check[i] = -1; //전부 -1로 초기화를 시킨다.
		}
		
		
		String S = sc.nextLine();
		
		for(int i =0 ; i<S.length(); i++ ) {
			char ch = S.charAt(i);//각 문자를 아스키 코드로 담는다.
			
			if(check[ch-'a'] == -1) {
				check[ch-'a'] =i;//문자-인덱스 를 대응하여 담을수 있다.
			}
		}
		
		for(int value : check) {
			System.out.print(value + " ");
		}
		

	}

}
