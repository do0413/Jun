package jun07;

import java.util.Arrays;
import java.util.Scanner;

public class jun10809_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		int[] arr = new int[26]; //소문자 배열
		for (int i =0; i<arr.length; i++) {
			arr[i]=-1; 
		}
		
		for(int i=0; i<S.length(); i++) {
			if(arr[S.charAt(i)-'a'] ==-1) {
			arr[S.charAt(i)-'a']=i;
			}
		}
		 
		for(int value : arr) {
			System.out.print(value + " ");
		}

	}

}
