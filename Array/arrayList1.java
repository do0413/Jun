package Array;

import java.util.*;

public class arrayList1 {
	
	public static void main(String[] args) {
		System.out.println("---------------Array-------------");
		//-------------------------
		//-----Array------------
		//-------------------------
		int[] array = {1,2,3,4};
		//출력하기
		//array는 배열안에 원소들을 보려면 Arrays.toString을 사용해야한다.
		System.out.println("array로 출력(참조값이 출력된다): " + array);
		System.out.println("Arrays.toString로 출력:" + Arrays.toString(array));
		
		//array는 길이가 정해져있기때문에, 
		//newArray 새로 배열을 만들어야한다.
		//for문을 이용해서 추가한다.
		int[] newArray = new int[array.length+1];
		int newnew=2;
		for(int i=0; i<newArray.length; i++) {
			if(i==newArray.length-1) {
				newArray[i]=newnew;
			}
			else {
				newArray[i]=array[i];
			}
		}
		System.out.println("Arrays.toString로 newArray출력:" + Arrays.toString(array));
		
		
		char[] charArr = {'a','b','c'};
		char charrA='A';
		char charrB='A'+1;
		System.out.println("charArr를 출력 (참조값이 출력된다) : " + charArr);
		System.out.println("charrA를 출력 (문자가 출력된다) : " + charrA);
		System.out.println("charrA에 1을 더한값 출력 (아스키코드가 문자로 반환된다. 숫자로입력하여 문자출력) : " + charrB);
		
		System.out.println("------------------------------------");
		//-------------------------
		//----ArrayList---------
		//-------------------------
		System.out.println("----------Arraylist---------------");
		ArrayList<String> arraylist = new ArrayList<>();
		ArrayList<Integer> arraylist2 = new ArrayList<>();
		arraylist.add("Test1");
		arraylist.add("Test2");
		arraylist.add("Test3");
		arraylist2.add(1);
		arraylist2.add(2);
		arraylist2.add(3);
		
		//출력하기
		//그냥 print로 부르면 된다.
		System.out.println("arraylist String타입 출력: "+arraylist);
		System.out.println("arraylist Int타입 출력: "+arraylist2);
		
		//-------------------------
		//----배열의 복사(두가지 방법)---------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------배열의 복사(두가지 방법)-----------");
		int[] array1 = {1,2,3,4};
		int[] newArray1= new int[array1.length];
		System.arraycopy(array1, 0, newArray1, 0, array1.length);
		
		int[] newArray2 = newArray1.clone();
		System.out.println("newArray1를 system.arraycopy를 사용해 출력: "+Arrays.toString(newArray1));
		System.out.println("newArray2를 clone()를 사용해 출력: "+Arrays.toString(newArray2));
		
	}

}
