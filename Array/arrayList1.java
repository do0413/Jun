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
		System.out.println("array�� ���(�������� ��µȴ�): " + array);
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
		
		
		char[] charArr = {'a','b','c'};
		char charrA='A';
		char charrB='A'+1;
		System.out.println("charArr�� ��� (�������� ��µȴ�) : " + charArr);
		System.out.println("charrA�� ��� (���ڰ� ��µȴ�) : " + charrA);
		System.out.println("charrA�� 1�� ���Ѱ� ��� (�ƽ�Ű�ڵ尡 ���ڷ� ��ȯ�ȴ�. ���ڷ��Է��Ͽ� �������) : " + charrB);
		
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
		
		//-------------------------
		//----�迭�� ����(�ΰ��� ���)---------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------�迭�� ����(�ΰ��� ���)-----------");
		int[] array1 = {1,2,3,4};
		int[] newArray1= new int[array1.length];
		System.arraycopy(array1, 0, newArray1, 0, array1.length);
		
		int[] newArray2 = newArray1.clone();
		System.out.println("newArray1�� system.arraycopy�� ����� ���: "+Arrays.toString(newArray1));
		System.out.println("newArray2�� clone()�� ����� ���: "+Arrays.toString(newArray2));
		
	}

}
