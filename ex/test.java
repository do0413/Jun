package ex;
import java.util.*;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int N = sc.nextInt();
		String S = sc.nextLine();
		
		//알파벳인덱스를 담는 배열
		int[] arr = new int[26];
		
		//알파벳이 몇개인지 세기
		for(int i=0; i<S.length(); i++) {
			int ch= S.charAt(i);
			if('a'<= ch && ch<='z') {
				ch = S.charAt(i)-'a';//소문자는 대문자인덱스로 바꾼다.
			}else {
				ch=S.charAt(i)-'A';
			}
			
			arr[ch]++;
		}
		
		//가장 큰수를 뽑기
		int maxx=-1;
		for(int val : arr) {
			int a=Math.max(val,maxx);
			maxx=a;
		}
		System.out.println("arr배열: "+ Arrays.toString(arr));
		System.out.println("maxx: "+maxx);
		
		//제일큰수를 가진 인덱스를 뽑기
		int index=0;
		int A=-1;
		char chh=' ';
		int ii=-1;
		for(int i=0; i<arr.length; i++) {
			int a= arr[i];
			if(maxx==a ) { //잡았다 요놈
				index++;
				if(index>1) {
					chh='?';
				}else {
					chh=(char)(i+65);
				}
				
			}
			
		}
		System.out.println("answer: "+ chh);


	}//main

}
