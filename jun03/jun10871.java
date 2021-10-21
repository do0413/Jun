package jun03;

import java.io.*;
import java.util.StringTokenizer;

public class jun10871 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 StringTokenizer st;
		 
		 st = new StringTokenizer(br.readLine(), " ");
		 int N = Integer.parseInt(st.nextToken());
		 int X = Integer.parseInt(st.nextToken());
		 
		 StringBuilder sb = new StringBuilder();//문자열을 더할때
		 st= new StringTokenizer(br.readLine(), " ");
		 
		 for(int i=0; i<N; i++) {
			 int seq= Integer.parseInt(st.nextToken());
			 
			 if(seq <X) {
				 sb.append(seq).append(" ");
			 }
		 
		 }
		 System.out.println(sb);
		 //bw.write(sb);
		 br.close();
		 bw.close();

	}

}
