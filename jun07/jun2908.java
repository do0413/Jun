package jun07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jun2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//reverse()메소드는 저장된 문자열을 뒤집는다.
		//그리고 StringBuilder타입을 문자열로 반환 시키기 위해 toString()을 써준다.
		//글고 문자열로 반환시킨걸 integer.parselint()로 String->int타입으로 변경
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
	
		System.out.println(A>B ? A : B);
	}

}
