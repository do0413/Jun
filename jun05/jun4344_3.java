package jun05;

import java.util.*;
public class jun4344_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		
		for(int i=0; i<C; i++) {
			int N = sc.nextInt();
			
			int[] arr= new int[N];
			
			float total=0;
			float sum=0;
			float avg=0;
			int count=0;
			for(int j=0; j<N; j++) {
				arr[j]=sc.nextInt();
				
				sum+= arr[j];
			}
			avg = sum/N;
			
			//구한 평균보다 높은 학생을 카운트하기
			for(int k=0; k<N; k++) {
				if(arr[k]>avg) {
					count++;
				}
			}
			
			total=(float)count/N;
			System.out.printf("%.3f%%\n", total*100);
		}//for end
		
		

	}

}
