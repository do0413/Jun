package jun07;

import java.util.Scanner;

public class jun1316 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int N = sc.nextInt();
		int count =0;
		
		
		for (int i =0; i<N; i++) {
			if(check()==true) {
				count++;
			}
		}
		System.out.println(count);

	}	
	
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev =0;
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev!=now) {
				
				// 해당 문자가 처음 나오는 경우 (false 인 경우)
				if(check[now-'a'] == false) {
					check[now-'a']=true;
					prev =now;
				}
				
				// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨) 
				else {
					return false; //함수종료
				}
			}
			
			//앞선 문자의 i번째 문자가 같다면,
			else {
				continue;
			}
		}
		
		return true;
	}

}
