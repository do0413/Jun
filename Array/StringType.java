package Array;

import java.util.Arrays;

public class StringType {

	public static void main(String[] args) {
		//-------------------------
		//----String클래스의 주요 메서드--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------String클래스의 주요 메서드-----------");

		//char charAt(int index); //문자열에서 해당 index에있는 문자를 반환한다.
		//int length() //문자열의 길이를 반환
		//String substring(int from, int to) //문자열에서 해당 범위(from~to)에있는 문자열을 반환한다.(이때 to는 미포함)
		//boolean equals("Object obj) // 문자열의 내용이 obj와 같은지 확인. 같으면  ture.
		//char[] toCharArray() // 문자열을 문자배열(char[])로 변환해서 반환한다.
		
		
		//-------------------------
		//----char배열과 String클래스의 변환--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------char배열과 String클래스의 변환-----------");
		char[] chArr= {'A','B','C'};
		String str = new String(chArr);
		char[] tmp = str.toCharArray();        
		
		System.out.println("chArr을 string클래스 변환 출력 : " + Arrays.toString(chArr) );
		System.out.println("str을 char배열로 변환 출력 : " + Arrays.toString(tmp));
		//System.out.println("charr : "+ chArr);
		
		//-------------------------
		//----String배열 모르스부호로 변환하는예제--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------String배열 모르스부호로 변환하는예제-----------");
		String source = "ABCD";
		String[] morse = {".-","-...","-.-.", "-..", "."};
		String result="";
		
		for(int i=0; i<source.length(); i++) {
			result += morse[source.charAt(i)-'A'];
		}
		System.out.println("source : " +source);
		System.out.println("morse : " +result);
	}

}
