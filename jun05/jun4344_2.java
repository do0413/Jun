package jun05;

import java.util.Scanner;

public class jun4344_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int M = sc.nextInt();
			
			int[] arr= new int[M];
			float total=0;
			float avg=0;
			float num=0;
			int count=0;
			
			for (int j=0; j<M; j++) {
				arr[j]=sc.nextInt();
				total += arr[j];
			}
			avg = (float)total/M;
			
			for (int j=0; j<M; j++) {
				if(avg<arr[j]) {
					count++;
				}
			}
			
			num = (float)count/M; //
			System.out.println("count " +count);
			System.out.println("M " + M);
			System.out.println("num " + num);
			System.out.println("avg " + avg);
			System.out.println("total " + total);
			System.out.printf("%.3f%%",num*100);
			
		}

	}

}
