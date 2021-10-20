package jun03;

import java.io.*;

public class jun2742 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N= Integer.parseInt(br.readLine());
		for (int i=0; i<N; i++) {
			bw.write(N-i + "\n");
		}
		
		bw.close();
	}

	
}
