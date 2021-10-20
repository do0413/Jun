package jun01;

import java.util.Scanner;

public class jun2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C= B%10; //³ª¸ÓÁö 5
		int D= B/10; //¸ò 38
		int E= B/100; //3
		int F= D%10; //8
		
		
		System.out.println(A*C);
		System.out.println(A*F);
		System.out.println(A*E);
		System.out.println(A*B);
		
		
		sc.close();
	}

}
