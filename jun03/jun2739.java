package jun03;

import java.util.Scanner;

public class jun2739 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int N=sc.nextInt();
		sc.close();
		
		for(int i=0; i<9; i++) {
			System.out.println(N+"*"+ (i+1) +"="+N*(i+1));
			
		}
		
	}

}
