package jun04;

import java.io.*;
import java.util.StringTokenizer;

public class jun10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		String str;
		StringBuilder sb = new StringBuilder();
			
		while((str=br.readLine()) !=null) {
			
			st = new StringTokenizer(str, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			sb.append(A+B).append("\n");
		}
		System.out.print(sb);
		

	}

}
