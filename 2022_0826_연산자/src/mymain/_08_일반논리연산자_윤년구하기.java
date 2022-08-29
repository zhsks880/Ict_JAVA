package mymain;

import java.util.Scanner;

public class _08_일반논리연산자_윤년구하기 {

	/*
	윤년: 1년 366일인 해(년도)
	조건1 : 400년의 배수인 해
	조건2 : 4의 배수이면서 100의 배수가 아닌해
			(조건21 %% 조건22)
			
	if(조건1 || 조건2)
		윤년
	else
		평년
	*/
	
	public static void main(String[] args) {
		//변수선언
		int year;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도를 입력:");
		year = scanner.nextInt();
		//    조건1      또는            조건2
		//    					조건21 이면서 조건22
		if((year%400==0) || (year%4==0 && year%100!=0))
			System.out.printf("[%d]년도는 윤년\n", year);
		else
			System.out.printf("[%d]년도는 평년\n", year);
		
				
		scanner.close();
		
		
	}

}
