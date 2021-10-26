package jun07;

import java.util.Scanner;

public class jun5622 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String S = sc.next();
		int check[] = new int[8];
		int total =0; 
		//int k=0;
		//System.out.println(check[S.charAt(k)-65]);//0
		for (int i=0; i<S.length(); i++) {
		
			if(S.charAt(i)==65||S.charAt(i)==66||S.charAt(i)==67) {
				check[0]++; //index 0에 저장한다.
			}
			else if (S.charAt(i)==68||S.charAt(i)==69||S.charAt(i)==70) {
				check[1]++; //index 1에 저장한다.
			}
			else if (S.charAt(i)==71||S.charAt(i)==72||S.charAt(i)==73) {
				check[2]++; //index 2에 저장한다.
			}
			else if (S.charAt(i)==74||S.charAt(i)==75||S.charAt(i)==76) {
				check[3]++; //index 3에 저장한다.
			}
			else if (S.charAt(i)==77||S.charAt(i)==78||S.charAt(i)==79) {
				check[4]++; //index 4에 저장한다.
			}
			else if (S.charAt(i)==80||S.charAt(i)==81||S.charAt(i)==82||S.charAt(i)==83) {
				check[5]++; //index 5에 저장한다.
			}
			else if (S.charAt(i)==84||S.charAt(i)==85||S.charAt(i)==86) {
				check[6]++; //index 6에 저장한다.
			}
			else if (S.charAt(i)==87||S.charAt(i)==88||S.charAt(i)==89||S.charAt(i)==90) {
				check[7]++; //index 7에 저장한다.
			}
			//count[ S.charAt(i)-65]++;
		}
		
		for (int i=0; i<check.length; i++) {
			total += (i+3)*check[i];
			System.out.println("check " + "["+ i+"] :"+ check[i]);
		}
		System.out.println(total);
		

	}

}
