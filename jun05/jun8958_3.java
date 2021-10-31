package jun05;

import java.util.Scanner;

public class jun8958_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		String[] arr = new String[N];
		
		for(int j=0; j<N; j++) {
			arr[j] = sc.next();
			
		}	
		sc.close();	
			
		
		for(int i=0; i<arr.length; i++) {
			int point=0;
			int total=0;
			for(int j=0; j<arr[i].length(); j++) {
				
				
				char ch = arr[i].charAt(j);
				if(ch=='O') {
					point++;
				}else {
					point=0;
				}
				total+=point;
			}
			System.out.println(total);
		}
			
		
	}
		
		
}


