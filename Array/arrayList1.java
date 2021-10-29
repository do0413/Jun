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
		System.out.println("array로 출력: " + array);
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
		
	}

}
