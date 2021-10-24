package jun06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jun1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(arit(Integer.parseInt(br.readLine())));
		
		
	}

	public static int arit(int N) {
		int count=0;
		
		if(N<100) {
			return N;
		}
		else {
			count =99;
			if( N ==1000) {
				N=999;
			}
			
			for(int i=100; i<=N; i++) {
				int a = i%10; //일의자리
				int b = (i/10)%10; //백의자리
				int c = i/100; //백의자리
				
				if((c-b) ==(b-a)) {
					count++;
				}
			}
		
		}
		return count;
	}

}
