package jun03;

import java.io.*;

public class jun2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			for(int k=0; k<i; k++ ) {
				bw.write("*");
			}
			bw.write("\n");
		}
		br.close();
		bw.close();
	}

}
