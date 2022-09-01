package mymain;

import java.util.Scanner;

public class Q6_factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int temp;
		int f =1;
		System.out.print("정수입력 : ");
		temp = scanner.nextInt();
		
		for(int i = 1; i<=temp; i++) {
			f = f * i;
			System.out.printf("입력[%d] 결과[%d]\n", temp, f);
		}
		scanner.close();
	}

}
