package mymain;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//실수의 거듭 제곱 값을 구해라
		
		double r;
		int n;
		double sum = 1;
		
		System.out.print("실수를 입력하세요>>");
		r = scanner.nextDouble();
		System.out.print("정수를 입력하세요>>");
		n = scanner.nextInt();
		
		for(double i =1; i<=4; i++) {
			sum = r * i;
			System.out.printf("r[%f]값 n[%d]값 결과값[%f]\n", r, n, sum);
		}
		
		//실수 r 과 정수 n = r??
		
		
		scanner.close();
	}

}
