package jun05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jun2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10]; //0~9까지 체크할 길이의 배열생성
		
		int total = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		
		String str = String.valueOf(total);
		System.out.println("str : " +  str);
		
		for(int i=0; i< str.length(); i++) {
			arr[(str.charAt(i)) -48]++;
		}
		
		for(int n : arr) {
			System.out.println(n);
		}

	}

}
