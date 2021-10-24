package jun06;

public class jun4673 {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
			if(n<10001) {
				check[n] =true;			
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			if(!check[i]) { //false인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
 
 
	
	public static int d(int number) { //함수
		int sum = number;
		
		while(number !=0) {
			sum = sum + (number%10); //첫째자리 더하기
			number = number/10; //첫째자리를 잘라낸 새 숫자
		}
		
		return sum;
		
	}

}

