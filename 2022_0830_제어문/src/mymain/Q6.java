package mymain;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int factorial; 
		factorial = scanner.nextInt();
		System.out.print("�����Է�: ");
		int sum =1;

		for(int i=factorial; factorial>1; factorial--) {
			sum = sum * factorial;
			
		}
		System.out.println(factorial);
		
		scanner.close();		
	}

}
