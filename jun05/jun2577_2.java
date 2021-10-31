package jun05;

import java.util.Scanner;

public class jun2577_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt()*sc.nextInt()*sc.nextInt();
		String str = Integer.toString(val);
		sc.close();
		
		int[] check = new int[10];
		for (int i=0; i<str.length(); i++) {
			check[str.charAt(i)-'0']++;
		}
		
		for(int a:check) {
			System.out.println(a);
		}
	}

}
