package jun07;

import java.util.Scanner;

public class jun11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		
		int N = sc.nextInt();
		String a = sc.next();
		sc.close();
		
		int sum =0;
		
		for(int i=0; i<N; i++) {
			sum += a.charAt(i)-48;
			
		}
		System.out.println(sum);
		

	}

}
