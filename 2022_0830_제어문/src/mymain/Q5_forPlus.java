package mymain;

import java.util.Scanner;

public class Q5_forPlus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int sum=0;
		System.out.print("정수입력: ");
		num = scanner.nextInt();
		
		for(int i=0; i<=num; i++) {
			sum = sum + i;
			System.out.printf("n값이[%d] 1부터n까지의합[%d]\n", i, sum);
		}		
	scanner.close();
	}
}
