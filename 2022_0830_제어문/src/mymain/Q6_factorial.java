package mymain;

import java.util.Scanner;

public class Q6_factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int temp;
		int f =1;
		System.out.print("�����Է� : ");
		temp = scanner.nextInt();
		
		for(int i = 1; i<=temp; i++) {
			f = f * i;
			System.out.printf("�Է�[%d] ���[%d]\n", temp, f);
		}
		System.out.println("�����" + f);
		scanner.close();
	}

}
