package jun03;

import java.util.Scanner;

public class jun8393 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		int k=0;
		for (int i=0; i<=n; i++) {
			
			k+=i;
		}
		System.out.println(k);
	}

}
