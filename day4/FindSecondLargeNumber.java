package week1.day4;

import java.util.Arrays;

public class FindSecondLargeNumber {

	public static void main(String[] args) {
		int data[]= {3,2,11,4,6,7};
		int n=data.length;
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		for (int i = 0; i < data.length; i++) {
		}
		System.out.println("Second highest number" + data[n-2]);

	}

}
