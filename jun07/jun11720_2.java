package jun07;

import java.util.Scanner;

public class jun11720_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N= sc.nextInt();
		String S = sc.next();
		
		int total=0;
		for(int j=0; j<N; j++) {
			
			total += S.charAt(j)-'0';

		}
		System.out.println(total);
	}

}
