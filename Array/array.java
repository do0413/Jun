package Array;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		//-------------------------
		//----배열의 활용---------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------배열의 총합과 평균-----------");
		int sum=0;
		float average =0f; //보다 벙확한 평균값을 얻기위해
		
		int[] score = {100,88,100,100,90};
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum/(float)score.length;
		System.out.println("총 합 : "+ sum);
		System.out.println("평균 : " + average);
		
		//-------------------------
		//----배열의 최대값 최소값---------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------배열의 최대값 최소값-----------");
		int[] score2 = {79,100,88,55,66,90};
		
		int max =score2[0]; 
		int min =score2[0];
		
		for(int i=0; i<score2.length; i++) {
			if(max>score2[i]) {
				max = score2[i];
			}else if(min <score2[i]) {
				min = score2[i];
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
		//-------------------------
		//----배열의 섞기---------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------배열의 섞기-----------");
		
		int[] numArr = new int[10];
		
		System.out.println("numArr을 섞기전---- " );
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		System.out.println("numArr 섞기전 배열을 toString으로 출력해보기" + Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10); //0~9중의 임의값을 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println("numArr을 섞은 결과 ---- " );
		System.out.println("numArr을 섞은 배열을 toString으로 출력해보기" + Arrays.toString(numArr));
		for(int i=0; i<numArr.length; i++) { //출력해보기.
			System.out.print(numArr[i]);
		}
		
		//-------------------------
		//----배열의 섞기 2--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------배열의 섞기 2 -----------");
		//1부터 10까지의 숫자 공이있다. 여기서 임의로 3개를 뽑아보자.
		int[] ball = new int[10];
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1; // ball이라는 배열에 1부터 10까지 저장한다.
		}
		
		int temp =0;
		int j =0;
		for(int i=0; i<3; i++) {
			j=(int)(Math.random()*10);//0부터 9까지의 값을 얻는다. 왜? 인덱스로 쓸꺼니까.
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		//출력하기
		for(int i=0; i<3; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
		
		//-------------------------
		//----임의의 값으로 배열 채우기--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------임의의 값으로 배열 채우기-----------");
		
		//불연속한 범위의 값으로 배열채우기
		int[] code= {-1,-3,4,6,0};
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			int tmp = code[(int) (Math.random()*code.length)];
			arr[i] =tmp;
		}
		//출력
		System.out.println("불연속한 값으로 배열채우기 결과 :"+Arrays.toString(arr));
		
		//-------------------------
		//----정렬하기(버블정렬)--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------정렬하기(버블정렬)-----------");
		
		int[] numArr2 = {1,3,4,4,2,1,3,8,4,3};
		System.out.println();
		
		for(int i=0;i<numArr2.length-1; i++) {
			boolean changed = false; //자리바꿈이 발생했는지 확인한다.
			
			for(int k=0; k<numArr2.length-1-i; k++) {
				 if(numArr2[k] > numArr2[k+1]) {
					 int temp2 =numArr2[k];
					 numArr2[k] = numArr2[k+1];
					 numArr2[k+1] = temp2;
					 changed= true;
				 }
			}
			
			if (!changed) { //changed가 false면(자리바꿈이 일어나지않으면) 종료
				break;
			}
			//자리바꿈 내용 출력
			for(int p=0; p<numArr2.length; p++) {
				System.out.print(numArr2[p]);
			}
			System.out.println();
		}//자리바꿈 end i
		
		
		//-------------------------
		//----빈도수구하기--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------빈도수구하기-----------");
		int[] numArr3=new int [10];
		int[] count = new int [10];
		
		System.out.print("numArr3 : ");
		for(int i=0; i<numArr3.length; i++) {
			numArr3[i] = (int)(Math.random()*10); 
			System.out.print(numArr3[i]);
		}
		System.out.println();
		
		for (int i=0; i<numArr3.length; i++) {
			count[numArr3[i]]++;
		}
		
		//출력하기
		for (int i=0; i<numArr3.length; i++) {
			System.out.println("숫자"+i+"의 갯수 :"+count[i]);
		}
	}//end main

}//end class
