package Array;

import java.util.Arrays;

public class StringType {

	public static void main(String[] args) {
		//-------------------------
		//----StringŬ������ �ֿ� �޼���--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------StringŬ������ �ֿ� �޼���-----------");

		//char charAt(int index); //���ڿ����� �ش� index���ִ� ���ڸ� ��ȯ�Ѵ�.
		//int length() //���ڿ��� ���̸� ��ȯ
		//String substring(int from, int to) //���ڿ����� �ش� ����(from~to)���ִ� ���ڿ��� ��ȯ�Ѵ�.(�̶� to�� ������)
		//boolean equals("Object obj) // ���ڿ��� ������ obj�� ������ Ȯ��. ������  ture.
		//char[] toCharArray() // ���ڿ��� ���ڹ迭(char[])�� ��ȯ�ؼ� ��ȯ�Ѵ�.
		
		
		//-------------------------
		//----char�迭�� StringŬ������ ��ȯ--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------char�迭�� StringŬ������ ��ȯ-----------");
		char[] chArr= {'A','B','C'};
		String str = new String(chArr);
		char[] tmp = str.toCharArray();        
		
		System.out.println("chArr�� stringŬ���� ��ȯ ��� : " + Arrays.toString(chArr) );
		System.out.println("str�� char�迭�� ��ȯ ��� : " + Arrays.toString(tmp));
		//System.out.println("charr : "+ chArr);
		
		//-------------------------
		//----String�迭 �𸣽���ȣ�� ��ȯ�ϴ¿���--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------String�迭 �𸣽���ȣ�� ��ȯ�ϴ¿���-----------");
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
