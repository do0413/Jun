package jun07;

import java.util.Scanner;

public class jun2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int T= sc.nextInt(); //케이스횟수
			//int srt[] = new int[T];
			
			for (int j=0; j<T; j++) {
				
				int R = sc.nextInt(); //반복횟수
				String S = sc.next(); //문자열 s를 받기
				
				
				for(int k=0; k<S.length(); k++) { //문자열을순서대로.
					for(int i=0; i<R; i++) {	//순서의 문자열을 R개출력
					 System.out.print(S.charAt(k));
					}
				}
				
				System.out.println();
			}

	}

}
