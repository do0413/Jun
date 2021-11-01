package jun07;

import java.util.Scanner;

public class jun2941_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int count =0;
		
		for(int i=0; i<S.length(); i++) {
			//System.out.println("i : "+i);
			//System.out.println("count : "+ count);
			char ch = S.charAt(i);
			
			if(ch=='c' ) {
				if(i<S.length()-1) {
					if(S.charAt(i+1)=='=' ) {
						
						i++;
					}else if (S.charAt(i+1)=='-') {
						i++;
					}
				}
			}else if(ch=='d') {
				if(i<S.length()-1) {
					if(S.charAt(i+1)=='z' ) {
						if(i<S.length()-2) {
							if(S.charAt(i+2)=='=') {
							
								i+=2;
							}
						}
					}else if(S.charAt(i+1)=='-'){
						
						i++;
					}
				}
					
			}else if(ch=='l') {
				if(i<S.length()-1) {
					if(S.charAt(i+1)=='j') {
						//count++;
						i++;
					}
				}	
			}else if(ch=='n') {
				if(i<S.length()-1) {
					if(S.charAt(i+1)=='j') {
						//count++;
						i++;
					}
				}
			}else if(ch=='s') {
				if(i<S.length()-1) {
					if(S.charAt(i+1)=='=') {
						//count++;
						i++;
					}
				}	
			}else if(ch=='z') {
				if(i<S.length()-1) {
					if(S.charAt(i+1)=='=') {
						//count++;
						i++;
					}
				}
		}
			count++;
		
	}
		System.out.println(count);
		
	}//main
}//class
