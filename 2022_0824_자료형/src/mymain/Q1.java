package mymain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// 1.2개의 정수를 입력받는다(가로,세로)
		// 2.2개수의 수를 이용해서 면적을 구한다 : 면적=가로*세로
		// 3.출력

		// 입력도구필요
		Scanner scanner = new Scanner(System.in);

		// 변수선언
		int garo;
		int sero;
		int area; // 면적저장할 변수

		// 코드정렬단축키 : Ctrl+shift+F

		// 입력
		// 방법1

		/*
		 * System.out.print("가로길이:"); garo = scanner.nextInt();
		 * 
		 * scanner.nextLine(); System.out.print("세로길이:"); sero = scanner.nextInt();
		 */

		
		// 방법2
		System.out.printf("가로/세로 : ");
		garo = scanner.nextInt();
		sero = scanner.nextInt();
		
		// 계산
		area = garo * sero;

		// 출력
		System.out.println("=========[결과값]=========");
		System.out.printf("면적 : %d(㎠)\n", area);

		scanner.close();

	}

}
