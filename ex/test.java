package ex;
import java.util.*;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int N = sc.nextInt();
		String S = sc.nextLine();
		
		//���ĺ��ε����� ��� �迭
		int[] arr = new int[26];
		
		//���ĺ��� ����� ����
		for(int i=0; i<S.length(); i++) {
			int ch= S.charAt(i);
			if('a'<= ch && ch<='z') {
				ch = S.charAt(i)-'a';//�ҹ��ڴ� �빮���ε����� �ٲ۴�.
			}else {
				ch=S.charAt(i)-'A';
			}
			
			arr[ch]++;
		}
		
		//���� ū���� �̱�
		int maxx=-1;
		for(int val : arr) {
			int a=Math.max(val,maxx);
			maxx=a;
		}
		System.out.println("arr�迭: "+ Arrays.toString(arr));
		System.out.println("maxx: "+maxx);
		
		//����ū���� ���� �ε����� �̱�
		int index=0;
		int A=-1;
		char chh=' ';
		int ii=-1;
		for(int i=0; i<arr.length; i++) {
			int a= arr[i];
			if(maxx==a ) { //��Ҵ� ���
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
