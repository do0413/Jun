package jun07;

import java.util.Scanner;

public class jun10809_3 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String S= sc.nextLine();
		int[] index =new int[26];//a~z까지의 인덱스
		
		for(int i=0; i<index.length; i++) {
			index[i]=-1; //-1로 전체 초기화
		}
			
		for(int i=0; i<S.length(); i++) {
			System.out.println("S.length: " +S.length());

			if(index[S.charAt(i)-'a']==-1) {
				index[S.charAt(i)-'a']=i;
			}
		}
		
		for(int val : index) {
			System.out.print(val+ " ");
		}
		
	}

}
