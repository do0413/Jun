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
				
				// �ش� ���ڰ� ó�� ������ ��� (false �� ���)
				if(check[now-'a'] == false) {
					check[now-'a']=true;
					prev =now;
				}
				
				// �ش� ���ڰ� �̹� ���� ���� �ִ� ��� (�׷�ܾ �ƴϰ� ��) 
				else {
					return false; //�Լ�����
				}
			}
			
			//�ռ� ������ i��° ���ڰ� ���ٸ�,
			else {
				continue;
			}
		}
		
		return true;
	}

}
