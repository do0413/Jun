package jun03;

import java.io.*;

public class jun2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N= Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			
			for(int k=1; k<N-i; k++) {
				bw.write(" ");
			}
			for(int p=0; p<i+1; p++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		br.close();
		bw.close();

	}

}
