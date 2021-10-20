package jun02;

import java.util.Scanner;

public class jun2753 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int A=sc.nextInt();
		sc.close();
		
		int B= A%4;
		int C= A%100;
		int D= A%400;
		/*System.out.println(B);
		System.out.println(C);
		System.out.println(D);*/
		if(B==0 && (C!=0 || D==0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
