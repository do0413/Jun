package jun05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jun1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N= Integer.parseInt(br.readLine());
		float[] arr= new float[N];
		
		float total = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());	
		}
		
		float max=0;
		for (float value: arr) {
			
			if(max < value) {
				max = value;
			}
			
		}
		
		for(int i=0; i<N; i++) {
			arr[i]= (float)(arr[i]/max)*100;
			total += arr[i];
		}
		
		System.out.println((float)total/N);

	}

}
