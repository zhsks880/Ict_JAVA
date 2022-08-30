package mymain;

import java.util.Scanner;

public class _01_Ex_if1 {

	public static void main(String[] args) {
		String menu;
		Scanner scanner = new Scanner(System.in);

		System.out.println("레시피를 고르세요");
		System.out.println("1.떡볶이");
		System.out.println("2.라면");
		System.out.println("3.짜장면");
		
		System.out.printf("레시피번호: ");
		menu = scanner.next();
		System.out.println();
		//라면 입력시-> 문자열 비교는 .equals() 이용한다 menu=="라면" <<이거 안됨(숫자만저거가능)
		// if문 쓰고 {} 화 안하면 이 첫줄만 if문 먹고 나머지는 걍 출력임
		// if문 뒤에 ; <<이거 넣으면 else 부분부터 오류가 뜨기 시작함(조심해라)
		if (menu.equals("2")) {
			System.out.println("========[라면끓이기]========");
			System.out.println("1.물을 끓인다.");
			System.out.println("2.면을 넣는다.");
			System.out.println("3.스프를 넣는다.");
			System.out.println("4.3분을 기다린다.");
		} else if (menu.equals("1")) {
			System.out.println("========[떡볶이끓이기]========");
			System.out.println("1.물을 끓인다.");
			System.out.println("2.떡을 넣는다.");
			System.out.println("3.고추장를 넣는다.");
			System.out.println("4.10분을 기다린다.");
		} else if (menu.equals("3")) {
			System.out.println("========[짜장면 끓이기]========");
			System.out.println("1.물을 끓인다.");
			System.out.println("2.면을 넣는다.");
			System.out.println("3.춘장를 넣는다.");
			System.out.println("4.10분간 비빈다.");
		}
				
		scanner.close();
	}

}
