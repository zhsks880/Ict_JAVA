package mymain;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//�Ǽ��� �ŵ� ���� ���� ���ض�
		
		double r;
		int n;
		double sum = 1;
		
		System.out.print("�Ǽ��� �Է��ϼ���>>");
		r = scanner.nextDouble();
		System.out.print("������ �Է��ϼ���>>");
		n = scanner.nextInt();
		
		for(double i =1; i<=4; i++) {
			sum = r * i;
			System.out.printf("r[%f]�� n[%d]�� �����[%f]\n", r, n, sum);
		}
		
		//�Ǽ� r �� ���� n = r??
		
		
		scanner.close();
	}

}
