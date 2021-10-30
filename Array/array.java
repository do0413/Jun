package Array;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		//-------------------------
		//----�迭�� Ȱ��---------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------�迭�� ���հ� ���-----------");
		int sum=0;
		float average =0f; //���� ��Ȯ�� ��հ��� �������
		
		int[] score = {100,88,100,100,90};
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum/(float)score.length;
		System.out.println("�� �� : "+ sum);
		System.out.println("��� : " + average);
		
		//-------------------------
		//----�迭�� �ִ밪 �ּҰ�---------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------�迭�� �ִ밪 �ּҰ�-----------");
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
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);
		
		//-------------------------
		//----�迭�� ����---------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------�迭�� ����-----------");
		
		int[] numArr = new int[10];
		
		System.out.println("numArr�� ������---- " );
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		System.out.println("numArr ������ �迭�� toString���� ����غ���" + Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10); //0~9���� ���ǰ��� ��´�.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println("numArr�� ���� ��� ---- " );
		System.out.println("numArr�� ���� �迭�� toString���� ����غ���" + Arrays.toString(numArr));
		for(int i=0; i<numArr.length; i++) { //����غ���.
			System.out.print(numArr[i]);
		}
		
		//-------------------------
		//----�迭�� ���� 2--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------�迭�� ���� 2 -----------");
		//1���� 10������ ���� �����ִ�. ���⼭ ���Ƿ� 3���� �̾ƺ���.
		int[] ball = new int[10];
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1; // ball�̶�� �迭�� 1���� 10���� �����Ѵ�.
		}
		
		int temp =0;
		int j =0;
		for(int i=0; i<3; i++) {
			j=(int)(Math.random()*10);//0���� 9������ ���� ��´�. ��? �ε����� �����ϱ�.
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		//����ϱ�
		for(int i=0; i<3; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
		
		//-------------------------
		//----������ ������ �迭 ä���--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------������ ������ �迭 ä���-----------");
		
		//�ҿ����� ������ ������ �迭ä���
		int[] code= {-1,-3,4,6,0};
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			int tmp = code[(int) (Math.random()*code.length)];
			arr[i] =tmp;
		}
		//���
		System.out.println("�ҿ����� ������ �迭ä��� ��� :"+Arrays.toString(arr));
		
		//-------------------------
		//----�����ϱ�(��������)--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------�����ϱ�(��������)-----------");
		
		int[] numArr2 = {1,3,4,4,2,1,3,8,4,3};
		System.out.println();
		
		for(int i=0;i<numArr2.length-1; i++) {
			boolean changed = false; //�ڸ��ٲ��� �߻��ߴ��� Ȯ���Ѵ�.
			
			for(int k=0; k<numArr2.length-1-i; k++) {
				 if(numArr2[k] > numArr2[k+1]) {
					 int temp2 =numArr2[k];
					 numArr2[k] = numArr2[k+1];
					 numArr2[k+1] = temp2;
					 changed= true;
				 }
			}
			
			if (!changed) { //changed�� false��(�ڸ��ٲ��� �Ͼ��������) ����
				break;
			}
			//�ڸ��ٲ� ���� ���
			for(int p=0; p<numArr2.length; p++) {
				System.out.print(numArr2[p]);
			}
			System.out.println();
		}//�ڸ��ٲ� end i
		
		
		//-------------------------
		//----�󵵼����ϱ�--------
		//-------------------------
		System.out.println("------------------------------------");
		System.out.println("------�󵵼����ϱ�-----------");
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
		
		//����ϱ�
		for (int i=0; i<numArr3.length; i++) {
			System.out.println("����"+i+"�� ���� :"+count[i]);
		}
	}//end main

}//end class
