package mymain;

import java.util.Scanner;

public class Q5_forPlus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int sum=0;
		System.out.print("�����Է�: ");
		num = scanner.nextInt();
		
		for(int i=0; i<=num; i++) {
			sum = sum + i;
			System.out.printf("n����[%d] 1����n��������[%d]\n", i, sum);
		}		
	scanner.close();
	}
}
