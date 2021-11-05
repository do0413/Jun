package ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ex3048 {

	public static void main(String[] args) {
		// 개미
		//https://www.acmicpc.net/problem/3048
		
		Scanner sc = new Scanner(System.in);
		
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		//System.out.println("N1: "+N1);
		
		String A= sc.next();
		String B= sc.next();
		
		int T = sc.nextInt();
		sc.close();
		//System.out.println("string A: "+A);
		
		//A그룹은 문자열을 뒤집어야한다.
		StringBuffer sb = new StringBuffer(A);
		String A1 = sb.reverse().toString();
		//System.out.println("A1: "+A1);
		//String[] str= new String[A.length()+B.length()];
		char[] str= new char[A1.length()+B.length()];
		System.out.println("str배열: " +Arrays.toString(str));
		
		//배열로 따로따로 인덱스에 넣되, 하나의 배열로 합침
		for(int i=0; i<str.length; i++) {
			if(i<A1.length()) {
				str[i] =A1.charAt(i);
			}else {
				str[i]=B.charAt(i-A1.length());
			}
		}
		
		System.out.println("str배열 정렬후: " +Arrays.toString(str));
		
		//자리를 바꿔봅시다.
		int num=0;
		char ch=' ';
		String chrr= "";
		for(int i=0; i<str.length; i++) {
			chrr+=(char)str[i];
			System.out.println("chrr: "+chrr);
		}
		
		//chrr에담긴 char배열을 이용한다. 거기 다 담겨있으니까.
		String[] AA= new String[A.length()];
		String[] BB= new String[B.length()];
		for(int i=AA.length-1;  i>=0; i--) {
			String temp= AA[i];
			AA[i]=BB[i];
			BB[B.length()-i] = temp;
			//System.out.println("AA["+i+"]: "+AA[i]);
			//System.out.println("BB["+(B.length()-i)+"]: "+BB[B.length()-i]);
		}
		

	}

}
