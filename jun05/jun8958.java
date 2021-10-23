package jun05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jun8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		String arr[] = new String[N];
		
		for (int i=0; i<N; i++) {
			
			arr[i] = br.readLine();
			
		}
		
		for (int i=0; i< N; i++) {
			
			int count=0;
			int sum=0;
			
			for (int j=0; j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					count++;
				}else {
					count=0;
				}
				
				sum +=count;
			}
			
			sb.append(sum).append('\n');
			//sb.append(sum);
		}
		
		System.out.println(sb);
	}

}
