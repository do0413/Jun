package jun06;

import java.util.*;
public class jun1065_3 {

	public static void main(String[] args) {
		// �Ѽ�����
		Scanner sc = new Scanner(System.in);
		
		int N= sc.nextInt();
		
		int count =0;
		
		
		//1~99������ N����.
		if(1<=N&&N<=99) {
			count = N;
		}

		else if(N==1000) {
			count=999;
		}
		//�ƴҶ�.
		else  {
			count =99;
			for(int i=100; i<=N; i++) {
				for(int j=0; j<1; j++) {
					int a=i%10; //�����ڸ�
					int b=(i/10)%10;
					int c=i/100;
					if((c-b)==(b-a)) {
						count++;
					}else {
						break;
					}
				}
			}
		}
		System.out.println(count);
		
		
		
		
		
		
		String url= "www.codechobo.com";
		
		System.out.printf("%s",url);
		System.out.printf("%s%n",url);
		System.out.printf("%s",url);
		
		
		
	}

}
