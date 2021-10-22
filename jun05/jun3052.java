package jun05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jun3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] check = new boolean[42];
		//int[] arr= new int[10];
		
		for (int i=0; i<10; i++) {
			check[Integer.parseInt(br.readLine())%42] =true;
		}
		
		int count=0;
		for(boolean value : check) {
			if(value) {
				count++;
			}
		}
		
		System.out.println(count);
			
	}

}
