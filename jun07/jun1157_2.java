package jun07;

import java.util.Scanner;

public class jun1157_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S= sc.next();
		int[] check = new int[26]; //´ë¹®ÀÚ
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			if('A'<= ch && ch<='Z') {
				check[ch-'A']++;
			}else {
				check[ch-'a']++;
			}
		}
		
		int max=-1;
		char ch='?';
		for(int i=0; i<check.length; i++) {
			if(max < check[i]) {
				max = check[i];
				ch = (char)(i);
				System.out.println("--:"+ch);
			}else if (max==check[i+1]) {
				ch ='?';
			}
		}
		
		System.out.println(ch);

	}

}
