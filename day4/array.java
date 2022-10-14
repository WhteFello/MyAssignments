package week1.day4;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int[] number= {1,2,3,4,5,6};
		int length = number.length;
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		for(int i=number.length-1;i>=0;i++) {
			System.out.println(number[i]);
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
