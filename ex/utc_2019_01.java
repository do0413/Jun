package ex;
import java.util.*;
public class utc_2019_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=15000;
		int[] moneyBox= {50000,10000,5000,1000,500,100,50,10,1};
		int[] answer= new int[moneyBox.length];

		for(int i=0; i<moneyBox.length; i++) {
			int a= money/moneyBox[i];
			answer[i]=a;
			money=money%moneyBox[i];
			System.out.println("a: "+ a);
			System.out.println("answer["+i+"]: "+ answer[i]);
			System.out.println("money: "+ money);
			System.out.println("----");
		}
		
		System.out.println("answr: "+Arrays.toString(answer));
	}//main

}
