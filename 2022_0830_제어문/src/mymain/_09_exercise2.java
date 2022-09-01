package mymain;

import java.util.Scanner;

public class _09_exercise2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=0; i<=200; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		sum = 0;
		int sum1 = 0;
		for (int i=0; i<=10; i++) {
			sum -= i;
		}
			sum1 = sum*3;
		System.out.println(sum);
		System.out.println(sum1);

	}

}
