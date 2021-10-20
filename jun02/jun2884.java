package jun02;

import java.util.Scanner;

public class jun2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H=sc.nextInt();
		int M=sc.nextInt();
		//int time= H*60+M;
		sc.close();
		
		if(H != 0) {
			int total=H*60+M-45;
			H= total/60;
			M= total%60;
			System.out.print(H +" "+ M);
		}else {
			H=24;
			int total=H*60+M-45;
			H= total/60;
			M= total%60;
			if(H==24) {
				H=0;
			}
			System.out.print(H +" "+ M);
		}
	}

}
