package jun07;

import java.io.IOException;
import java.util.Scanner;

public class jun11654 {

	public static void main(String[] args) throws IOException {
		//애초에 system.in은 byte값으로 문자한개만 읽으면서
		//해당문자에 대응되는 아스키코드 값을 저장한다.
		//int a = System.in.read(); 
		//System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.next().charAt(0);
		// [charAt()] String 에서 char 로, 즉 문자열을 잘라 문자로 변환한다.
		//int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장한다.
		System.out.println(ch);
	}

}
