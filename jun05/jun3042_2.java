package jun05;

import java.util.Scanner;

public class jun3042_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] check= new int[42]; //0~41±îÁö
		for(int i=0; i<10; i++) {
			int a =sc.nextInt();
			check[a%42]++;
		}
		
		int count=0;
		for(int i=0; i<check.length; i++) {
			if(check[i]!=0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
