package mymain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int su1,su2,su3;
		System.out.print("세 개의 정수를 입력하세요: ");
		su1 = scanner.nextInt();
		su2 = scanner.nextInt();
		su3 = scanner.nextInt();
		
		//2수를 비교
		int min = (su1 > su2) ? su2 : su1;
		//나머지 1수를 비교
		min = min > su3 ? su3 : min;
		//고로 가장 작은수는 min 에 저장
		
		System.out.printf("입력수:%d %d %d\n", su1, su2, su3);
		System.out.printf("세계의 수 중에서 가장 작은 값은 : %d", min);
			
		scanner.close();
		
	}

}
