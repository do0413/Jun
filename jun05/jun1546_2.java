package jun05;

import java.util.Arrays;
import java.util.Scanner;

public class jun1546_2 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		float total=0;
		//float avg=0f;
		float max=arr[N-1];
		System.out.println("max" +  max);
		for(float val : arr) {
			total += (float)(val/max)*100;
			System.out.println("val" + val);
			System.out.println("total" + total);
		}
		System.out.println((float)(total/N));

	}

}
