package jun06;

import java.util.Scanner;

public class jun1065_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count=0;
		if(1<=N&& N<=99) {//1의자리
			count=N;	
		}else if(100<=N && N<=999) {
			count =99;
			for(int i=100; i<=N; i++) {
				for(int j=0; j<1; j++) {
					int a = i%10; //일의자리
					int b = (i/10)%10;
					int c = i/100;
					if((a-b) == (b-c)) {
						count++;
					}
				}
			}
			
		}else { //1000일때
			count=999;
		}
		
		System.out.println(count);
		
	}//main

}//class
