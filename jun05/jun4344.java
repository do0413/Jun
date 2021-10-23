package jun05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class jun4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		
		//int C = sc.nextInt();
		int C = Integer.parseInt(br.readLine());
		//float total=0;
		
		 
		
		
		for(int i=0; i<C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());//학생수
			
			int arrNum[] = new int[N]; //점수를 담는 배열
			
			for(int j=0; j<N; j++) {
				
				int M = Integer.parseInt(st.nextToken());//학생들의 점수
				
				arrNum[j]=M;
				
			}
			
			float total=0;
			float avg=0;
			float A=0;
			
			int count=0;
			
			for(float value: arrNum) {
				
				total += value;
				
			}
			
			avg = (float) total/N; //평균값
			
			for (int p=0; p<arrNum.length; p++) {
				
				if(arrNum[p]>avg) {
					count++;
				}
			}
			
			A = (float) count/N;
			
			System.out.printf("%.3f%%\n", A*100);
		}
		
	}

}
