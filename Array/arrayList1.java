package Array;

import java.util.*;

public class arrayList1 {
	
	public static void main(String[] args) {
		System.out.println("---------------Array-------------");
		//-------------------------
		//-----Array------------
		//-------------------------
		int[] array = {1,2,3,4};
		//����ϱ�
		//array�� �迭�ȿ� ���ҵ��� ������ Arrays.toString�� ����ؾ��Ѵ�.
		System.out.println("array�� ���: " + array);
		System.out.println("Arrays.toString�� ���:" + Arrays.toString(array));
		
		//array�� ���̰� �������ֱ⶧����, 
		//newArray ���� �迭�� �������Ѵ�.
		//for���� �̿��ؼ� �߰��Ѵ�.
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
		System.out.println("Arrays.toString�� newArray���:" + Arrays.toString(array));
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
		
		//����ϱ�
		//�׳� print�� �θ��� �ȴ�.
		System.out.println("arraylist StringŸ�� ���: "+arraylist);
		System.out.println("arraylist IntŸ�� ���: "+arraylist2);
		
	}

}
